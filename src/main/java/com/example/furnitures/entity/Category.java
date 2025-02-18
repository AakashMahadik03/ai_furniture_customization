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
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private int categoryId;
	
	private String categoryName;
	
	private String description;
	
}
