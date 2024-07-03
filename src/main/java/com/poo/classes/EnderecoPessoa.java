package com.poo.classes;

public class EnderecoPessoa {

    int enderecoId;
    int cep;
    String cidade;
    String uf;
    String logradouro;
    String complemento;

    public EnderecoPessoa(int cep) {
        this.cep = cep;
        this.enderecoId = IdGenerator.generateEnderecoPessoaId();
    }
    public String toString(){
        return "Endereço do usuário [ID: " + enderecoId + ", CEP: " + cep + "]";
    }

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
