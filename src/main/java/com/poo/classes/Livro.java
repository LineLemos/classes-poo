package com.poo.classes;

public class Livro {

    int livroId;
    String titulo;
    int edicao;
    int ano;

    public Livro(String titulo, int edicao, int ano) {
        this.titulo = titulo;
        this.edicao = edicao;
        this.livroId = IdGenerator.generateLivroId();
    }
    public String toString(){
        return "Livro [ID: " + livroId + ", Título: " + titulo + ", Edição: " + edicao + ", Ano: " + ano + "]";
    }


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
