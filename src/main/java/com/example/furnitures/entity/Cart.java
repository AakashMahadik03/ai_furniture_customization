package com.example.furnitures.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Carts")
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private int cartId;
	
	private int userId;
	
	private int productId;
	
	private int quantity;

	
}
