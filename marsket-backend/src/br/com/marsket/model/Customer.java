package br.com.marsket.model;

public class Customer extends People {

	private int id;
	private boolean haveDiscount;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean getHaveDiscount() {
		return haveDiscount;
	}
	public void setHaveDiscount(boolean haveDiscount) {
		this.haveDiscount = haveDiscount;
	}
	
}
