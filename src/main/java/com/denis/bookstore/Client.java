package com.denis.bookstore;

public class Client {
    private String name;
    private Address address;
    private String telephone;
    private String email;
    private String dateOfBirth;
    private String cpf;
    

    public Client(String name, Address address, String telephone, String email, String dateOfBirth, String cpf) {
        this.name = name;
        this.address = address;
        this.telephone = telephone;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.cpf = cpf;
    }

    public Client() {

    }

    @Override
    public String toString() {
        return "Client{" +
                "nome='" + name + '\'' +
                ", address=" + address +
                ", telefone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                ", dataDeNascimento='" + dateOfBirth + '\'' +
                ", cpf='" + cpf + '\'' +
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

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}