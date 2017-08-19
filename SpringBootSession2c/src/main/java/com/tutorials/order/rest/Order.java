package com.tutorials.order.rest;

import java.util.Date;

import com.tutorials.customer.rest.Customer;
import com.tutorials.product.rest.Product;
public class Order {
	private long id;
	private double amount;
	private Date dateOrder;
	private Customer customer;
	private Product product;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;}
	public Date getDateOrder() {
		return dateOrder;
	}
	public void setDateOrder(Date dateOrder) {
		this.dateOrder = dateOrder;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
}