package com.poo.classes;

public class Pessoa {

    int pessoaId;
    String nome;
    int rg;
    String cpf;
    EnderecoPessoa ep = new EnderecoPessoa();

    public int pessoaId(){
        return pessoaId;
    }
    public void pessoaId( int pessoaId){
        this.pessoaId = pessoaId;
    }

    public String getnome(){
        return nome;
    }

    public void setnome(String nome){
        this.nome = nome;
    }

    public int rg(){
        return rg;
    }
    public void rg(int rg){
        this.rg = rg;
    }
    public int cpf(){
        return cpf;
    }
    public void cpf(int cpf){
        this.rg = cpf;
    }
}
