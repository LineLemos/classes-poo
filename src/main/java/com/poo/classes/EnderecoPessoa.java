package com.poo.classes;

public class EnderecoPessoa {

    int enderecoId;
    String cidade;
    String uf;
    String logradouro;
    String complemento;

    public int getenderecoId(){
        return enderecoId;
    }
    public void setenderecoId( int enderecoId){
        this.enderecoId = enderecoId;
    }

    public String getcidade(){
        return cidade;
    }

    public void setcidade(String cidade){
        this.cidade = cidade;
    }
    public String getuf(){
        return uf;
    }

    public void setuf(String uf){
        this.uf = uf;
    }
    public String getlogradouro(){
        return logradouro;
    }

    public void setlogradouro(String logradouro){
        this.logradouro = logradouro;
    }
    public String getcomplemento(){
        return logradouro;
    }

    public void setcomplemento(String complemento){
        this.complemento = complemento;
    }


}
