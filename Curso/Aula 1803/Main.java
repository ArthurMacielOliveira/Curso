package br.com.sistema;

import br.com.sistema.model.Geral;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Geral conta1 = new Geral();
        conta1.setNome("Leonardo");
        conta1.setCPF("123.123.123-12");
        conta1.setEndereco("Rua Gelik da Silva");
        conta1.setFORMAPAGA("Cartão de Crédito");
        conta1.setNcartao("451 223 205 103 ");
        conta1.setNtitular("Leonardo Gelik Da Silva");
        conta1.setDVALID(1232022);
        conta1.setCVV(267);

        System.out.println(conta1.toString());
        if (conta1.getFORMAPAGA() == "Cartão de Crédito") {System.out.println("Selecionado: Cartão de Crédito!" +
                "\n Informações:" + "\n" +
                "Número do cartão:" + conta1.Ncartao
       + "\n Nome do Titular:" + conta1.getNtitular() +
                "\n Data de validade: " + conta1.DVALID
        +"\n CVV: " + conta1.getCVV());}
        else if(conta1.getFORMAPAGA() == "Boleto"){
            System.out.println("Boleto foi selecionado, Estamos gerando...");
        }


    }
}

