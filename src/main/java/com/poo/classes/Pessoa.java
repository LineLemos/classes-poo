package com.poo.classes;

public class Pessoa {

    int pessoaId;
    String nome;
    int rg;
    String cpf;
    EnderecoPessoa ep = new EnderecoPessoa();

    public int getpessoaId(){
        return pessoaId;
    }
    public void setpessoaId( int pessoaId){
        this.pessoaId = pessoaId;
    }

    public String getnome(){
        return nome;
    }

    public void setnome(String nome){
        this.nome = nome;
    }

    public int getrg(){
        return rg;
    }
    public void setrg(int rg){
        this.rg = rg;
    }
    public String getcpf(){
        return cpf;
    }
    public void setcpf(String cpf){
        this.cpf = cpf;
    }
}
