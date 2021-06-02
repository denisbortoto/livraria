package com.denis.livraria;

import java.util.ArrayList;

public class Livro {
    private String codigo;
    private String nome;
    private String descricao;
    private double valorDeCompra;
    private double valorDeVenda;


    public Livro(
            String codigo,
            String nome,
            String descricao,
            double valorDeCompra,
            double valorDeVenda
    ) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.valorDeCompra = valorDeCompra;
        this.valorDeVenda = valorDeVenda;
    }

    public Livro() {

    }



    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorDeCompra() {
        return valorDeCompra;
    }

    public void setValorDeCompra(double valorDeCompra) {
        this.valorDeCompra = valorDeCompra;
    }

    public double getValorDeVenda() {
        return valorDeVenda;
    }

    public void setValorDeVenda(double valorDeVenda) {
        this.valorDeVenda = valorDeVenda;
    }

    public String imprimir() {
        return "Código: " + codigo + "\nNome: " + nome +
                "\nDescricao: " + descricao + "\nValor: " + valorDeVenda;
    }

}
