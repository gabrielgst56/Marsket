package br.com.marsket.model;

public class Custommer extends People {

	private int id;
	private int top;
	private boolean haveDiscount;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTop() {
		return top;
	}
	public void setTop(int top) {
		this.top = top;
	}
	public boolean getHaveDiscount() {
		return haveDiscount;
	}
	public void setHaveDiscount(boolean haveDiscount) {
		this.haveDiscount = haveDiscount;
	}
	
}
