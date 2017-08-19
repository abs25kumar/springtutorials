package com.tutorials.customer.rest;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Named
@Path("/")
public class CustomerRest {
	private static List<Customer> customers = new ArrayList<Customer>();
	static {
		Customer customer1 = new Customer(1,"Bob","bob@gmail.com");
		customers.add(customer1);
		Customer customer2 = new Customer(2,"Nancy","nancy@gmail.com");
		customers.add(customer2);
		Customer customer3 = new Customer(3,"Mary","mary@gmail.com");
		customers.add(customer3);
		Customer customer4 = new Customer(4,"John","john@gmail.com");
		customers.add(customer4);
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Customer> getCustomers() {
		return customers;
	}
	@GET
	@Path("customer")   
	@Produces(MediaType.APPLICATION_JSON)
	// http://localhost:8081/customer?id=1
	public Customer getCustomer(@QueryParam("id") long id) {
		Customer cli = null;
		for (Customer c : customers) {
			if (c.getId() == id)
				cli = c;
		}
		return cli;
	}
}