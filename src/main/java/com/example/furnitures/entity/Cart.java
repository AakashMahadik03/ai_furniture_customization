package com.example.furnitures.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name = "Carts")
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private int cartId;
	
	@OneToMany
	private List<Product> productList;
	
	private int quantity;
	
	private int cartPrice;
	
}
