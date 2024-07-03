package com.poo.classes;

public class Editora {

    int editoraId;
    String nome;

    public Editora(String nome) {
        this.nome = nome;
        this.editoraId = IdGenerator.generateEditoraId();
    }
    public String toString(){
        return "Editora [ID: " + editoraId + ", Nome: " + nome + "]";
    }


    public int geteditoraId(){
        return editoraId;
    }
    public void seteditoraId( int editoraId){
        this.editoraId = editoraId;
    }

    public String getnome(){
        return nome;
    }

    public void setnome(String nome){
        this.nome = nome;
    }

}
