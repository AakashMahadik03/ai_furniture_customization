package com.example.furnitures.entity;

import java.util.List;

import com.example.furnitures.enums.Status;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Entity
@Table(name = "Orders")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private int orderId;
	
	@OneToOne
	private User user;
	
	@OneToMany
	private List<Product> productList;
	
	private int quantity;
	
	private int totalPrice;
	
	@Enumerated(EnumType.STRING)
	private Status status;

}
