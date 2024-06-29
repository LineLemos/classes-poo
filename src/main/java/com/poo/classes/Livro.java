package com.poo.classes;

public class Livro {

    int livroId;
    String edicao;
    String titulo;
    String ano;

    public int getlivroId(){
        return livroId;
    }
    public void setlivroId(int livroId){
        this.livroId = livroId;
    }

    public String getedicao(){
        return edicao;
    }

    public void setedicao(String edicao){
        this.edicao = edicao;
    }
    public String gettitulo(){
        return titulo;
    }
    public void settitulo(String titulo){
        this.titulo = titulo;
    }

    public String getano(){
        return ano;
    }

    public void setano(String ano){
        this.ano = ano;
    }
    
}
