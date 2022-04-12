package br.com.sistema.model;

public class Aula {
    public int ID;
    public String Link;
    public String Conteudo;
    public String Titulo;

    public Aula(int ID, String link, String conteudo, String titulo) {
        this.ID = ID;
       this.Link = link;
       this.Conteudo = conteudo;
       this.Titulo = titulo;
    }
}
