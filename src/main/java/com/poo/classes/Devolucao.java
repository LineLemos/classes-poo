package com.poo.classes;

import java.time.LocalDate;

public class Devolucao {

    int devolucaoId;
    LocalDate dataDevolucao = LocalDate.now();

    public int getdevolucaoId(){
        return devolucaoId;
    }
    public int setdevolucaoId(int devolucaoId){
        return devolucaoId;
    }
  
    public LocalDate getdataDevolucao(){
        return dataDevolucao;
    }

    public void setdataDevolucao(LocalDate dataDevolucao){
        this.dataDevolucao = dataDevolucao;
    }

}
