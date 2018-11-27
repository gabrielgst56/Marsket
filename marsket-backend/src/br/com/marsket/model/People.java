package br.com.marsket.model;

public class People {

    private String firstName;
    private String lastName;
    private String cpf;

    public People(String firstName, String lastName, String cpf) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cpf = cpf;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "People{" + "firstName=" + firstName + ", lastName=" + lastName + ", cpf=" + cpf + '}';
    }

}
