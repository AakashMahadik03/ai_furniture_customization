package com.example.furnitures.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Entity
@Table(name = "Products")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private int productId;
	
	@OneToOne
	private Merchant merchant;
	
	private String productName;
	
	@ManyToOne
	private Category category;
	
	private String imageUrl;
	
	private String description;
	
	private int price;
	
	
}
