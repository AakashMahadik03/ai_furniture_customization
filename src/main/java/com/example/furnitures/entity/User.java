package com.example.furnitures.entity;

import java.util.List;

import com.example.furnitures.enums.Role;

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


@Data
@Entity
@Table(name = "Users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private int userId;
	
	private String firstName;
	
	private String lastName;
	
	private String emailId;
	
	private String password;
	
	private String phoneNumber;
	
	private String address;
	
	@OneToOne
	private Cart cart;
	
	@OneToMany
	private List<GeneratedImages> generatedImages;
	
	@Enumerated(EnumType.STRING)
	private Role role;
	
}
