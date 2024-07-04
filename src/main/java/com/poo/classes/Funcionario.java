package com.poo.classes;

abstract class Funcionario extends Pessoa {

    String login;
    String senha;
    double salario;

    public Funcionario(String nome, String cpf, String senha, String login, double salario, Endereco endereco){
        super(nome, cpf, endereco);

        this.login = login;
        this.senha = senha;

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    public boolean autentica(String login, String senha ){
        return this.login.equals(login) && this.senha.equals(senha);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
