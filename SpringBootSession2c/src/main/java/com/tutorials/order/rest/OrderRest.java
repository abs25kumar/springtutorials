package com.tutorials.order.rest;

import java.util.Date;
import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import org.springframework.web.client.RestTemplate;

import com.tutorials.customer.rest.Customer;
import com.tutorials.product.rest.Product;


@Named
@Path("/")
public class OrderRest {

	private long id = 1;
	@Inject
	RestTemplate restTemplate;
	@GET
	@Path("orders")
	@Produces(MediaType.APPLICATION_JSON)
	public Order submitOrder(@QueryParam("idCustomer") long idCustomer,
			@QueryParam("idProduct") long idProduct,
			@QueryParam("amount") long amount) {
		Order order = new Order();
		Customer customer = restTemplate.getForObject(
				"http://localhost:8081/customer?id=1", Customer.class,
					idCustomer);
		 Product product = restTemplate.getForObject(
				"http://localhost:8082/product?id=1", Product.class,
					idProduct);
		 Price price = restTemplate.getForObject(
				 "http://localhost:8080/prices/1", Price.class,
				    idProduct);
		
		order.setCustomer(customer);
		order.setProduct(product);
		order.setId(id);
		order.setAmount(price.getAmount());
		order.setDateOrder(new Date());
		id++;
		return order;
	}

}
