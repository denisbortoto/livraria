package com.denis.bookstore;

public class Book {
    private String id;
    private String name;
    private String description;
    private double costPrice;
    private double sellPrice;

    public Book(
            String id,
            String name,
            String description,
            double costPrice,
            double sellPrice
    ) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.costPrice = costPrice;
        this.sellPrice = sellPrice;
    }

    public Book() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(double costPrice) {
        this.costPrice = costPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public String imprimir() {
        return "Código: " + id + "\nNome: " + name +
                "\nDescricao: " + description + "\nValor: " + sellPrice;
    }

}
