package com.tutorials.product.rest;

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
public class ProductRest {
	private static List<Product> products = new ArrayList<Product>();
	static {
		Product product1 = new Product(1,"SK-Book-U001","Good to Great");
		Product product2 = new Product(2,"SKU-Elect-001", "Sony 52 Inches Television");
		Product product3 = new Product(3, "SKU-Book-002","The Art of the Deal");
		Product product4 = new Product(4,"SKU-Elec-002","lPhone 7 Plus");
		
		products.add(product1);
		products.add(product2);
		products.add(product3);
		products.add(product4);
	}
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Product> getProducts() {
		return products;
	}
	
	
	@GET
	@Path("product")
	@Produces(MediaType.APPLICATION_JSON)
	public Product getProduct(@QueryParam("id")long id) {
		Product prod = null;
		for (Product p : products) {
			if (p.getId() == id)
				prod = p;
		}
		return prod;
	}
}