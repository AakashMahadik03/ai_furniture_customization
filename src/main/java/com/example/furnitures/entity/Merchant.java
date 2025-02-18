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
@Table(name = "Merchants")
public class Merchant {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private int merchantId;
	
	private String firstName;
	
	private String lastName;
	
	private String email;
	
	private String phone_number;
	
	private String password;
	
	@OneToMany
	private List<Order> orderList;
	
	private float rating;
	
}
