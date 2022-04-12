package br.com.sistema;

import br.com.sistema.model.Aula;
import br.com.sistema.model.Cliente;

public class Main {
    public static void main(String[] args) {

        Cliente Bruno = new Cliente(" Foto1.jpg", " Bruno Bandeira Fernandes", " Masculino", " Cartão Black");
        Aula aula01 = new Aula(123 , "www.maciLuthier.class/assistir/aula01" , "Introdução a ferraemtas" , "Introdução a ferramentas");
        System.out.println(Bruno.toString());

    }
}
