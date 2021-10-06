package edu.wctc.wholesale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DistJavaWholesaleApplication {

	public static void main(String[] args) {
		SpringApplication.run(DistJavaWholesaleApplication.class, args);
	}

	/**
	 *  What is Missing?
	 *
	 * - Entity Objects For Product, Customer, and Wholesale_Order
	 *   (Entity Relationships, Order has a Customer, 	Customer has a name
	 *   						Order has a product, 	product  has a name and price)
	 *
	 * - RESTful Controller should handle request mapping of http://localhost:8080/api/orders/
	 *  and use jackson to return json (array of json objects)
	 *
	 * - Controller needs access to services that get pojos
	 * - Services need access to repos that convert SQL data to pojos
	 *
	 * - DTO that allows client access to array of json objects
	 *
	 * Wrapper entity object that holds data from wholesale order, project, and customer
	 *
	 * Order objects need to directly return
	 *    - customerName (customer id -> customer object -> customer name)
	 *    - purchaseDate
	 *    - purchaseOrderNumber
	 *    - productName (product id -> product object -> product name)
	 *    - terms
	 *    - shippedDate
	 *    - productCost (product id -> product object -> product cost)
	 *
	 * Exception handling?
	 *
	 * One quick change for github
	 *
	 * **/

}
