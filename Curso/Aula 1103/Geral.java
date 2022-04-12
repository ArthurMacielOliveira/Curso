package br.com.sistema.model;

public class Geral {
    public String Nome;
    public  String Endereco;
    public String CPF;
    public String FORMAPAGA;
    public String Ncartao;
    public String Ntitular;
    public double DVALID;
    public double CVV;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String endereco) {
        Endereco = endereco;
    }

    public String getCPF() {
        return CPF;
    }

    public String getFORMAPAGA() {
        return FORMAPAGA;
    }

    public void setFORMAPAGA(String FORMAPAGA) {
        this.FORMAPAGA = FORMAPAGA;
    }

    public String getNcartao() {
        return Ncartao;
    }

    public void setNcartao(String ncartao) {
        Ncartao = ncartao;
    }

    public String getNtitular() {
        return Ntitular;
    }

    public void setNtitular(String ntitular) {
        Ntitular = ntitular;
    }

    public double getDVALID() {
        return DVALID;
    }

    public void setDVALID(double DVALID) {
        this.DVALID = DVALID;
    }

    public double getCVV() {
        return CVV;
    }

    public void setCVV(double CVV) {
        this.CVV = CVV;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;


    }

    @Override
    public String toString() {
        return
                "\nNome: " + Nome +
                "\nEndereço: " + Endereco +
                "\nCPF: " + CPF +
                "\nForma de pagamento: " + FORMAPAGA ;
    }



    }

