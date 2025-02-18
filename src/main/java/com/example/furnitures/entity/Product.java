package com.example.furnitures.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Products")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private int productId;
	
	private int merchantId;
	
	private String productName;
	
	private int categoryId;
	
	private String imageUrl;
	
	private String description;
	
	private int price;
	
	
}
