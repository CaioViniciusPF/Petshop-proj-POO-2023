package com.mycompany.br.ufc.poo.petshop;

public class CEException extends Exception {
    private String Cpf;

    public CEException(String Cpf) {
        super("Exceção de Cpf já existente no cadastro [Numero: " + Cpf + "]");
        this.Cpf = Cpf;
    }

    public String getCpf() {
        return this.Cpf;
    }
}