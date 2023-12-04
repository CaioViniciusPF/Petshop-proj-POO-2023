package br.ufc.poo.petshop.Funcionarios;
import java.util.Scanner;
public class Tosador{
    private String tipo;
    private String nome;
    private int idade;
    Agendamento[] agendamentos = new Agendamento[100];
    private int contadorAgendamentos;
    
    public Tosador() {
        this.tipo = "Tosador";
    }
    
    /*
    public void fazAgendamento(){
        agendamentos[getContadorAgendamentos()] = new Agendamento(1);
        setContadorAgendamentos(getContadorAgendamentos()+1);
    }*/
    
    public void cadastrarTosador(){
        Scanner b = new Scanner(System.in);
        System.out.print("Digite o nome do Tosador: ");
        String novoNome = b.nextLine();
        System.out.print("Digite a idade do Tosador: ");
        int id = b.nextInt();
        setNome(novoNome);
        setIdade(id);
    }
    
    public void excluirAgendamento(int n){
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o codigo do agendamento que vc deseja excluir: ");
        int cod = s.nextInt();
        if(cod < 1 || cod > getContadorAgendamentos()){
            System.out.println("Agendamento não existe");
        } else if(cod == getContadorAgendamentos()){
            setContadorAgendamentos(getContadorAgendamentos()-1);
            System.out.println("Agendamento excluido com sucesso");
        } else {
            for (int i = (cod-1);i < (getContadorAgendamentos()-1);i++){
                agendamentos[i].setData(agendamentos[i+1].getData());
                agendamentos[i].setHorario(agendamentos[i+1].getHorario());
            }
            setContadorAgendamentos(getContadorAgendamentos()-1);
            System.out.println("Agendamento excluido com sucesso");
        }
    }
    
    public Agendamento[] getAgendamentos() {
        return agendamentos;
    }
    
    public void setAgendamentos(Agendamento[] agendamentos) {
        this.agendamentos = agendamentos;
    }
    
    public void exibirAgendamento(){
        if(getContadorAgendamentos() == 0){
            System.out.println("Esse funcionario não possui agendamentos");
        } else{
            for(int i = 0;i < getContadorAgendamentos();i++){
                System.out.println("Codigo agendamento: " + (i+1));
                agendamentos[i].exibirInformacoes();
                System.out.println("");
            }
        }
    }
    
    public void exibirTosador(){
        System.out.println("Nome: " + this.nome + "\nIdade: " + this.idade);
    }

    public int getIdade() {
        return idade;
    }
    
    

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getContadorAgendamentos() {
        return contadorAgendamentos;
    }

    public void setContadorAgendamentos(int contadorAgendamentos) {
        this.contadorAgendamentos = contadorAgendamentos;
    }

    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
