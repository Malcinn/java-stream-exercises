package space.gavinklfong.demo.streamapi;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;
import space.gavinklfong.demo.streamapi.models.Customer;
import space.gavinklfong.demo.streamapi.models.Order;
import space.gavinklfong.demo.streamapi.models.Product;
import space.gavinklfong.demo.streamapi.repos.CustomerRepo;
import space.gavinklfong.demo.streamapi.repos.OrderRepo;
import space.gavinklfong.demo.streamapi.repos.ProductRepo;

@Slf4j
@Component
public class AppCommandRunner implements CommandLineRunner {

	@Autowired
	private CustomerRepo customerRepos;
	
	@Autowired
	private OrderRepo orderRepos;
	
	@Autowired
	private ProductRepo productRepos;

	
	@Override
	public void run(String... args) throws Exception {
		log.info("running runner");
		List<Customer> customers = customerRepos.findAll();
		customers.forEach(System.out::println);
		
		List<Order> orders = orderRepos.findAll();
				
		
//		orders.stream()
//		.map(o -> o.getCustomer())
//		.forEach(i -> System.out.println(i.getName()));
		
//		log.info("Customer count: " + count);

//		orders.stream()
//		.flatMap(o -> o.getProducts().stream())
//		.forEach(System.out::println);
		
		
		List<Product> products = productRepos.findAll();
//		products.stream()
//		.flatMap(p -> p.getOrders().stream())
//		.forEach(System.out::println);


//		Exercise 1 — Obtain a list of products belongs to category “Books” with price > 100

//		List<Product> productListFiltered = products.stream()
//				.filter(p -> p.getCategory().equals("Books"))
//				.filter(p -> p.getPrice() > 100)
//				.collect(Collectors.toList());
//
//		productListFiltered.stream().forEach(System.out::println);


//		Exercise 2 — Obtain a list of order with products belong to category “Baby”

//		List<Order> ordersFiltered = orders.stream()
//				.filter(o -> o.getProducts()
//				 			  .stream()
//							  .anyMatch(p -> p.getCategory().equals("Baby")))
//				.collect(Collectors.toList());
//
//		ordersFiltered.stream().forEach(System.out::println);


//		Exercise 3 — Obtain a list of product with category = “Toys” and then apply 10% discount

//		List<Product> productsFiltered = products.stream()
//				.filter(p -> p.getCategory().equalsIgnoreCase("Toys"))
//				.map(p -> p.withPrice(p.getPrice()*0.10))
//				.collect(Collectors.toList());
//
//		productsFiltered.stream().forEach(System.out::println);


//		Exercise 4 — Obtain a list of products ordered by customer of tier 2 between 01-Feb-2021 and 01-Apr-2021

//		List<Product> productsFilterByRangeDate = orders.stream()
//				.filter(o -> o.getCustomer().getTier() == 2)
//				.filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021, 2, 1)) >= 0)
//				.filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021, 4, 1)) >= 0)
//				.flatMap(o -> o.getProducts().stream())
//				.distinct()
//				.collect(Collectors.toList());
//
//		productsFilterByRangeDate.stream().forEach(System.out::println);


	}

}
