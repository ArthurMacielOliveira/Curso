package br.com.sistema.model;

public class Cliente {
    public String IDFoto;
    public String Nome;
    public String Genero;
    public String Senha;


    public Cliente(String IDFoto, String nome, String genero, String senha) {
        this.IDFoto = IDFoto;
        this.Nome = nome;
        this.Genero = genero;
        this.Senha = senha;

    }

    @Override
    public String toString() {
        return "Cliente Novo" +
                "\nFoto selecionada: " + IDFoto +
                "\nNome:" + Nome +
                "\nGênero:" + Genero +
                "\nSenha:" + Senha;
    }
}
