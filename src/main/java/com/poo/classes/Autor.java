package com.poo.classes;

import java.util.UUID;

import org.springframework.util.IdGenerator;

public class Autor extends Pessoa{

    int autorId;

    public Autor(String nome, String cpf, Endereco endereco) {
        super(nome, cpf, endereco);
        
        this.autorId = IdGenerator.generateAutorId();
    }

    public String toString() {
        return "Autor [ID: " + autorId + ", Nome: " + nome + "]";
    }

    public int getautorId() {
        return autorId;
    }

    public void setautorId(int autorId) {
        this.autorId = autorId;
    }

    public String getnome() {
        return nome;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

}
