package com.billing.model;

import java.util.Set;

public class Bill {
	private Set<Good> set;
	private double salesTax;
	private double totalBill;
	
	public Set<Good> getSet() {
		return set;
	}
	public void setSet(Set<Good> set) {
		this.set = set;
	}
	public double getSalesTax() {
		return salesTax;
	}
	public void setSalesTax(double salesTax) {
		this.salesTax = salesTax;
	}
	public double getTotalBill() {
		return totalBill;
	}
	public void setTotalBill(double totalBill) {
		this.totalBill = totalBill;
	}
	
	
}
