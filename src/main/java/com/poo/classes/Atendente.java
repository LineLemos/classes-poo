package com.poo.classes;

public class Atendente extends Funcionario {

    public Atendente(String nome, String cpf, String senha, String login, double salario, Endereco endereco){

        super(nome, cpf, senha, login, salario, endereco);
    }

    public void contraCheque(){
        System.out.println("Impressão de contracheque para Atendente: ");
        System.out.println("Salário Base: " + getSalario());

    double fgts = getSalario() * 0.1;
    double inss = getSalario() * 0.12;
    System.out.println("FGTS: " + fgts);
    System.out.println("INSS: " + inss);
    
}
}
