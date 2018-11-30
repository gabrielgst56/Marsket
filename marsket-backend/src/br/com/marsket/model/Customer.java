package br.com.marsket.model;

public class Customer {

    private boolean haveDiscount;
    private String firstName;
    private String lastName;
    private String cpf;

    public Customer() {
    	
    }
    
    public Customer(boolean haveDiscount, String firstName, String lastName, String cpf) {
        this.haveDiscount = haveDiscount;
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setCpf(cpf);
    }

    public void setHaveDiscount(boolean haveDiscount) {
        this.haveDiscount = haveDiscount;
    }

    public boolean isHaveDiscount() {
        return haveDiscount;
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

}
