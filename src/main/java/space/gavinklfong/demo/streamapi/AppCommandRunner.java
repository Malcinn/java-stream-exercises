package space.gavinklfong.demo.streamapi;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Function;
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

		//Exercise 5 — Get the cheapest products of “Books” category

//		Optional<Product> product = products.stream()
//				.filter(p -> p.getCategory().equalsIgnoreCase("Books"))
//				.min(Comparator.comparing(Product::getPrice));
//
//		System.out.println(product);

		//Exercise 6 — Get the 3 most recent placed order

//		List<Order> ordersFiltered = orders.stream()
//				.sorted(Comparator.comparing(Order::getOrderDate).reversed())
//				.limit(3)
//				.collect(Collectors.toList());
//
//		ordersFiltered.stream().forEach(System.out::println);

		//Exercise 7 — Get a list of orders which were ordered on 15-Mar-2021, log the order records to the console and then return its product list

//		List<Product> productsFiltered = orders.stream()
//				.filter(o -> o.getOrderDate().isEqual(LocalDate.of(2021, 03, 15)))
//				.peek(o -> System.out.println(o.toString()))
//				.flatMap(o -> o.getProducts().stream())
//				.distinct()
//				.collect(Collectors.toList());
//
//		productsFiltered.stream().forEach(System.out::println);

//		Exercise 8 — Calculate total lump sum of all orders placed in Feb 2021

//		double totalAmountFebruary = orders.stream()
//				.filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021, 2, 1)) >= 0)
//				.filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021, 3, 1)) < 0)
//				.flatMap(o -> o.getProducts().stream())
//				.mapToDouble(p -> p.getPrice())
//				.sum();
//		System.out.println(totalAmountFebruary);

		//Exercise 9 — Calculate order average payment placed on 14-Mar-2021

//		Double result = orders.stream()
//				.filter(o -> o.getOrderDate().isEqual(LocalDate.of(2021,3,15)))
//				.flatMap(o -> o.getProducts().stream())
//				.mapToDouble(p -> p.getPrice())
//				.average()
//				.getAsDouble();
//
//		System.out.println(result);


		//Exercise 10 — Obtain a collection of statistic figures (i.e. sum, average, max, min, count) for all products of category “Books”


//		DoubleSummaryStatistics statistics = products.stream()
//				.filter(p -> p.getCategory().equalsIgnoreCase("Books"))
//				.mapToDouble(p -> p.getPrice())
//				.summaryStatistics();
//
//		System.out.println(statistics);

//		Exercise 11 — Obtain a data map with order id and order’s product count

//		Map<Long, Integer> dataMap = orders.stream()
//				.collect(
//						Collectors.toMap(
//								order -> order.getId(),
//								order ->  order.getProducts().size()
//						)
//				);
//
//		System.out.println(dataMap);

//		Exercise 12 — Produce a data map with order records grouped by customer

//		Map<Customer, List<Order>> dataMap = orders.stream()
//				.collect(
//						Collectors.groupingBy(o -> o.getCustomer())
//				);
//
//		System.out.println(dataMap);


//		Exercise 13 — Produce a data map with order record and product total sum
//
//		Map<Order, Double> dataMap = orders.stream()
//				.collect(
//						Collectors.toMap(
//								Function.identity(),
//								order -> order.getProducts().stream().mapToDouble(p-> p.getPrice()).sum()
//						)
//				);
//
//		System.out.println(dataMap);

//		Exercise 14 — Obtain a data map with list of product name by category

//		Map<String, List<String>> dataMap = products.stream()
//				.collect(
//						Collectors.groupingBy(
//								Product::getCategory,
//								Collectors.mapping(p -> p.getName(), Collectors.toList())
//						)
//				);
//
//		System.out.println(dataMap);

//		Exercise 15 — Get the most expensive product by category

		Map<String, Optional<Product>> dataMap = products.stream()
				.collect(
						Collectors.groupingBy(
								Product::getCategory,
								Collectors.maxBy(Comparator.comparing(Product::getPrice))
						)
				);

		System.out.println(dataMap);
	}

}
