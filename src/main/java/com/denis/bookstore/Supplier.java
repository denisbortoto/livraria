package com.denis.bookstore;

public class Supplier {
    private String name;
    private Address address;
    private String telephone;
    private String email;
    private String cnpj;


    public Supplier(String name, Address address, String telephone, String email, String cnpj) {
        this.name = name;
        this.address = address;
        this.telephone = telephone;
        this.email = email;
        this.cnpj = cnpj;
    }

    public Supplier() {

    }

    @Override
    public String toString() {
        return "Supplier{" +
                "nome='" + name + '\'' +
                ", address=" + address +
                ", telefone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                ", cnpj='" + cnpj + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getEndereco() {
        return address;
    }

    public void setEndereco(Address address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}

