package com.mycompany.br.ufc.poo.petshop;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;


public abstract class ClienteAbstrato   {
    protected String Nome ;
    protected String Telefone;
    protected int numPets;
    protected Pet[] Pets;
    protected Pet pet;
    protected String Cpf;
    protected int ContaPet = 0;
  


    public ClienteAbstrato( String Nome,String Telefone, String Cpf, int NumeroPets ){
        this.Nome = Nome;
        this.Telefone = Telefone;
        this.numPets= NumeroPets;
        this.Pets = new Pet[NumeroPets];
        this.Cpf = Cpf;
    }

    public void CadastraPet(Pet pet){

        if(Pets[ContaPet] == null){

            Pets[ContaPet] = pet ;
            ContaPet++;
        }

    }

    public String GetTelefone() { // Getters de cada atributo
        return Telefone;
    }
    public String GetNome() {
        return Nome;
    }
    public String GetCpf(){
        return Cpf;
    }
    public int GetNumeroDePets(){
        return numPets;
    }


    public abstract double GetCusto();
    
    public abstract void CadastrarCliente() throws CEException ;

    public boolean CpfExistente(String Cpf, String arquivo) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                if (linha.contains("CPF: " + Cpf)) {
                    return true;
                }
            }
        }
        return false; 
    }
}

