package com.denis.livraria;

public class Endereco {
    private String identificadorEndereco;
    private String rua;
    private int numero;
    private String bairro;
    private String cep;



    public Endereco(String identificadorEndereco, String rua, int numero, String bairro, String cep) {
        this.identificadorEndereco = identificadorEndereco;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cep = cep;
    }

    public Endereco() {

    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getIdentificadorEndereco() {
        return identificadorEndereco;
    }

    public void setIdentificadorEndereco(String identificadorEndereco) {
        this.identificadorEndereco = identificadorEndereco;
    }
}
