package com.poo.classes;

abstract class Pessoa{

    int pessoaId;
    String nome;
    String cpf;
    Endereco endereco;

    public Pessoa(String nome, String cpf, Endereco endereco){
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.pessoaId = IdGenerator.generatePessoaId();
    }
    public String toString(){
        return "Usuário [ID: " + pessoaId + ", Nome: " + nome + ", CPF: " + cpf + ", CEP: " + cep +"]";
    }

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

    public String getcpf(){
        return cpf;
    }
    public void setCpf(String cpf) {
        if (cpf != null && cpf.length() == 11) {
            this.cpf = cpf;
        } else {
            throw new IllegalArgumentException("Cpf deve conter 11 numeros");
        }
    }
    }

