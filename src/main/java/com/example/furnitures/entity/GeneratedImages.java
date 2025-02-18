package com.example.furnitures.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "GeneratedImages")
public class GeneratedImages {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private int imageId;
	
	@ManyToOne
	private User user;
	
	private String prompt;
	
	private String imageUrl;


	
}
