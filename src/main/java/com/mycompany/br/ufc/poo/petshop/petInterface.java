/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.br.ufc.poo.petshop;

import javax.swing.JOptionPane;

/**
 *
 * @author caiop
 */
public class petInterface extends javax.swing.JFrame {
    
    public petInterface() {
       initComponents();
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        petTitulo = new javax.swing.JLabel();
        inputNomePet = new javax.swing.JTextField();
        inputTipoPet = new javax.swing.JTextField();
        inputIdadePet = new javax.swing.JTextField();
        inputPesoPet = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputTAobservacoes = new javax.swing.JTextArea();
        servicosTitulo = new javax.swing.JLabel();
        bntEnviar = new javax.swing.JButton();
        checkBanho = new javax.swing.JCheckBox();
        checkVacina = new javax.swing.JCheckBox();
        checkTosa = new javax.swing.JCheckBox();
        jLabel1nomePet = new javax.swing.JLabel();
        jLabel1tipoPet = new javax.swing.JLabel();
        jLabel2idadePet = new javax.swing.JLabel();
        jLabel3pesoPet = new javax.swing.JLabel();
        jLabel4observacoesPet = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 204));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        petTitulo.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        petTitulo.setText("Pet");

        inputNomePet.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        inputTipoPet.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        inputIdadePet.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        inputPesoPet.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        inputPesoPet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPesoPetActionPerformed(evt);
            }
        });

        inputTAobservacoes.setColumns(20);
        inputTAobservacoes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        inputTAobservacoes.setRows(5);
        inputTAobservacoes.setToolTipText("");
        jScrollPane1.setViewportView(inputTAobservacoes);

        servicosTitulo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        servicosTitulo.setText("Serviços");

        bntEnviar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bntEnviar.setText("Enviar");
        bntEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntEnviarActionPerformed(evt);
            }
        });

        checkBanho.setText("Banho");

        checkVacina.setText("Vacina");

        checkTosa.setText("Tosa");

        jLabel1nomePet.setText("Nome");

        jLabel1tipoPet.setText("Tipo");

        jLabel2idadePet.setText("Idade");

        jLabel3pesoPet.setText("Peso");

        jLabel4observacoesPet.setText("Observações");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(bntEnviar)
                        .addGap(201, 201, 201))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(checkBanho)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(servicosTitulo)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(checkTosa)
                                .addGap(31, 31, 31)
                                .addComponent(checkVacina)))
                        .addGap(128, 128, 128))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1nomePet)
                            .addComponent(jLabel1tipoPet)
                            .addComponent(jLabel2idadePet)
                            .addComponent(jLabel3pesoPet))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(inputNomePet, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                .addComponent(inputTipoPet)
                                .addComponent(inputIdadePet)
                                .addComponent(inputPesoPet))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(jLabel4observacoesPet))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(petTitulo)))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(petTitulo)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputNomePet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1nomePet))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputTipoPet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1tipoPet))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputIdadePet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2idadePet))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputPesoPet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3pesoPet))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jLabel4observacoesPet)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(servicosTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkVacina)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(checkBanho)
                        .addComponent(checkTosa)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bntEnviar)
                .addGap(22, 22, 22))
        );

        inputIdadePet.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntEnviarActionPerformed
        String nome= inputNomePet.getText();
        String tipo= inputTipoPet.getText();
        String idadeStr = inputIdadePet.getText();
        String pesoStr = inputPesoPet.getText();
        String observacoes= inputTAobservacoes.getText();
        
        //preciso criar um arraty e pets ou so pegar o tamanho

        if (inputsEstaoPreenchidos() && checksboxEstaoPreenchidos()) {
            try {
                // Tentar converter os valores de idade e peso para inteiros
                int idade = Integer.parseInt(idadeStr);
                double peso = Double.parseDouble(pesoStr);
                Pet pet = new Pet( nome, tipo, observacoes, idade, peso);
                
                pet.resetServico();
                if(checkBanho.isSelected()){
                    pet.cadastrarServico(1);
                }
                if(checkTosa.isSelected()){
                    pet.cadastrarServico(2);
                }
                if(checkVacina.isSelected()){
                    pet.cadastrarServico(3);
                }
                pet.CalcValorServico();
                
                // Limpar campo
                inputNomePet.setText("");
                inputTipoPet.setText("");
                inputIdadePet.setText("");
                inputPesoPet.setText("");
                inputTAobservacoes.setText("");
                checkBanho.setSelected(false);
                checkTosa.setSelected(false);
                checkVacina.setSelected(false);
            } catch (NumberFormatException e) {
                // Se ocorrer um NumberFormatException, exibir mensagem de erro
                JOptionPane.showMessageDialog(this, "Idade e peso devem ser números inteiros", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            
            JOptionPane.showMessageDialog(petInterface.this, "Todos os campos devem ser preenchidos", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
        
        
        


    }//GEN-LAST:event_bntEnviarActionPerformed

    private void inputPesoPetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPesoPetActionPerformed
        
    }//GEN-LAST:event_inputPesoPetActionPerformed
    private boolean inputsEstaoPreenchidos() {
        return !inputNomePet.getText().isEmpty() && 
               !inputTipoPet.getText().isEmpty() && 
               !inputIdadePet.getText().isEmpty() && 
               !inputPesoPet.getText().isEmpty()&& 
               !inputTAobservacoes.getText().isEmpty();
    }
    private boolean checksboxEstaoPreenchidos() {
        return checkBanho.isSelected()|| checkTosa.isSelected()|| checkVacina.isSelected(); 
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(petInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(petInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(petInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(petInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new petInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntEnviar;
    private javax.swing.JCheckBox checkBanho;
    private javax.swing.JCheckBox checkTosa;
    private javax.swing.JCheckBox checkVacina;
    private javax.swing.JTextField inputIdadePet;
    private javax.swing.JTextField inputNomePet;
    private javax.swing.JTextField inputPesoPet;
    private javax.swing.JTextArea inputTAobservacoes;
    private javax.swing.JTextField inputTipoPet;
    private javax.swing.JLabel jLabel1nomePet;
    private javax.swing.JLabel jLabel1tipoPet;
    private javax.swing.JLabel jLabel2idadePet;
    private javax.swing.JLabel jLabel3pesoPet;
    private javax.swing.JLabel jLabel4observacoesPet;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel petTitulo;
    private javax.swing.JLabel servicosTitulo;
    // End of variables declaration//GEN-END:variables
}
