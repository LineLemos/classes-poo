package com.poo.classes;

public class IdGenerator {

    static int autorCounter = 0;
    static int devolucaoCounter = 0;
    static int editoraCounter = 0;
    static int emprestimoCounter = 0;
    static int enderecoCounter = 0;
    static int exemplarCounter = 0;
    static int livroCounter = 0;
    static int pessoaCounter = 0;

    static int generateAutorId() {
        return Integer.parseInt("1" + autorCounter++);
    }
    static int generateDevolucaoId() {
        return Integer.parseInt("2" + devolucaoCounter++);
    }
    static int generateEditoraId() {
        return Integer.parseInt("3" + editoraCounter++);
    }
    static int generateEmprestimoId() {
        return Integer.parseInt("4" + emprestimoCounter++);
    }
    static int generateEnderecoPessoaId() {
        return Integer.parseInt("5" + enderecoCounter++);
    }
    static int generateExemplarId() {
        return Integer.parseInt("6" + exemplarCounter++);
    }
    static int generateLivroId() {
        return Integer.parseInt("7" + livroCounter++);
    }
    static int generatePessoaId() {
        return Integer.parseInt("8" + pessoaCounter++);
    }

}
