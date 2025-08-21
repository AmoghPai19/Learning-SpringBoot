package com.codewithmosh.shope;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ShopeApplication {

	public static void main(String[] args) {

		ApplicationContext context=SpringApplication.run(ShopeApplication.class, args);

		var orderService=context.getBean(OrderService.class);
		orderService.placeOrder();
	}

}
