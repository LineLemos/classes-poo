package com.poo.classes;

import org.springframework.util.IdGenerator;

public class Autor {

    int autorId;
    String nome;

    public Autor(String nome) {
        this.nome = nome;
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
