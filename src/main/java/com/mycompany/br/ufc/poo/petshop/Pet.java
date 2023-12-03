/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.br.ufc.poo.petshop;


public class Pet {
    private String nomePet;
    private String tipo;
    private String observacoes;
    private int idadePet;
    private double pesoPet;
    private int[] servicos=new int[3];
    private double valorServico;
    private int indice = 0;
    int valorServico1=10;
    int valorServico2=20;
    int valorServico3=30;

    public Pet(String nomePet, String tipo, String observacoes, int idadePet, double pesoPet) {
        this.nomePet = nomePet;
        this.tipo = tipo;
        this.observacoes = observacoes;
        this.idadePet = idadePet;
        this.pesoPet = pesoPet;
    }
   
   
    
    public void cadastrarServico(int servico) {       
        for (int i = 0; i < 3; i++) {       
            if(servicos[i]==0){
               servicos[indice]=servico; 
               indice++;                   
               return;               
            }               
        }               
    }
    public void resetServico() {       
        for (int i = 0; i < 3; i++) {       
            this.servicos[i]=0; 
            this.indice=0;
            this.valorServico=0.0;
        }               
    }
    
    public void Nome(String nome){
        this.nomePet=nome;
        System.out.println(this.nomePet);

    }
    public void Tipo(String tipo){
        this.tipo=tipo;
        System.out.println(this.tipo);
    }
    public void Observacoes(String observacoes){
        this.observacoes=observacoes;
        System.out.println(this.observacoes);
    }
    public void IdadePet(int idade){
        this.idadePet=idade;
        System.out.println(this.idadePet);
    }
    public double CalcValorServico(){
        
        for (int index = 0; index < servicos.length; index++) {
            switch (servicos[index]) {
                case 1:
                    this.valorServico=this.valorServico+valorServico1;
                    break;
                case 2:
                    this.valorServico=this.valorServico+valorServico2;
                    break;
                case 3:
                    this.valorServico=this.valorServico+valorServico3;
                    break;
                default:
                    break;
            }
        }
        System.out.println("CalcValorServico(): "+this.valorServico);
        return this.valorServico;
        
    }
    public void PesoPet(double peso){
        this.pesoPet=peso;
        System.out.println(this.pesoPet);
    }
    //gets
    public String getNome() {
      return this.nomePet;
    }
    public int[] getServicos() {
        return this.servicos;
    }
    public String getTipo() {
      return this.tipo;
    }
    
    public double getValorServicos() {
      return this.valorServico;
    }
}
