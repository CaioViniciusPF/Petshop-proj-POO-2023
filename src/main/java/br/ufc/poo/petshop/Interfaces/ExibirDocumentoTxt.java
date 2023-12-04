package br.ufc.poo.petshop.Interfaces;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExibirDocumentoTxt extends JFrame {

    private JTextArea textArea;

    public ExibirDocumentoTxt() {
        super("Exibir Documento TXT");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null); // Centralizar a janela

        // Configurar o estilo de fonte para o JTextArea
        Font fonteTextArea = new Font("Arial", Font.PLAIN, 14);

        // Criar JTextArea para exibir o conteúdo do arquivo
        textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setFont(fonteTextArea);

        // Criar JScrollPane para permitir rolar o texto
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        // Adicionar JScrollPane ao JFrame
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        // Adicionar um painel superior com uma etiqueta informativa
        JPanel topPanel = new JPanel();
        topPanel.setBackground(Color.DARK_GRAY);
        topPanel.setLayout(new BorderLayout());

        JLabel labelInfo = new JLabel("Clientes Cadastrados");
        labelInfo.setForeground(Color.WHITE);
        labelInfo.setFont(new Font("Arial", Font.BOLD, 18));

        topPanel.add(labelInfo, BorderLayout.CENTER);

        getContentPane().add(topPanel, BorderLayout.NORTH);

        // Adicionar um painel inferior com um botão de retorno e um slider vertical
        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));

        JButton backButton = new JButton("Voltar");
        backButton.addActionListener(e -> voltarParaOutraJanela());
        bottomPanel.add(backButton);

        JSlider verticalSlider = new JSlider(JSlider.VERTICAL, 0, 100, 0);
        verticalSlider.addChangeListener(e -> navegarNoDocumento(verticalSlider.getValue()));
        bottomPanel.add(verticalSlider);

        getContentPane().add(bottomPanel, BorderLayout.SOUTH);

        // Carregar o conteúdo do arquivo txt
        carregarDocumentoTxt("clientes.txt");
    }

    private void carregarDocumentoTxt(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            StringBuilder content = new StringBuilder();
            String line;

            // Ler cada linha do arquivo e adicioná-la ao StringBuilder
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }

            // Definir o conteúdo do JTextArea
            textArea.setText(content.toString());

        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao carregar o arquivo: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void voltarParaOutraJanela() {
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
        dispose(); // Fecha a janela atual
    }

    private void navegarNoDocumento(int value) {
        // Adicione aqui a lógica para navegar no documento com base no valor do slider
        // Por exemplo, você pode definir a posição de rolagem do JTextArea
        int scrollPosition = (int) ((double) value / 100 * textArea.getDocument().getLength());
        textArea.setCaretPosition(scrollPosition);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
                e.printStackTrace();
            }

            ExibirDocumentoTxt exibirDocumentoTxt = new ExibirDocumentoTxt();
            exibirDocumentoTxt.setVisible(true);
        });
    }
}