package com.example.furnitures.entity;

import com.example.furnitures.enums.Status;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Orders")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private int orderId;
	
	private int userId;
	
	private int productId;
	
	private int merchantId;
	
	private int quantity;
	
	private int totalPrice;
	
	@Enumerated(EnumType.STRING)
	private Status status;


}
