package com.example.order.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.order.OrderServiceApplication;
import com.example.order.entity.Order;
import com.example.order.service.IOrderService;

@RestController
public class OrderController {
	@Autowired
	IOrderService orderService; //null
	
	@GetMapping("/order")
	String gerOrders() {
		return "Hello";
	}
	@PostMapping("/order")
	String createOrder( @RequestBody @Valid Order order) {
		return orderService.createOrder(order);
	}
	
	@PutMapping("/order/{id}")
	String updateOrder(@PathVariable("id") int id) {
		System.out.println(id);
		return "post response";
	}
	public IOrderService getOrderService() {
		return orderService;
	}
	public void setOrderService(IOrderService orderService) {
		this.orderService = orderService;
	}
}
