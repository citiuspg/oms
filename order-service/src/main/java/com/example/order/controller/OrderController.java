package com.example.order.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.order.entity.Order;

@RestController
public class OrderController {
	@GetMapping("/order")
	String gerOrders() {
		return "Hello";
	}
	@PostMapping("/order")
	String createOrder(@RequestBody Order order) {
		System.out.println(order.getName());
		return "post response";
	}
	
	@PutMapping("/order/{id}")
	String updateOrder(@PathVariable("id") int id) {
		System.out.println(id);
		return "post response";
	}
	
}
