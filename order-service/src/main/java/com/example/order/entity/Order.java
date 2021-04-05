package com.example.order.entity;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.lang.NonNull;

public class Order {
	@NotNull  //mandatory
	@NotBlank
	private String name;
	@NotNull
	@Digits(fraction = 2, integer=3 )
	private float price; //mandatory+numeric,  45.56
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		if(price<=0 ) {
			throw new IllegalArgumentException("price cannot be negative");
		}
		this.price = price;
	}
}
