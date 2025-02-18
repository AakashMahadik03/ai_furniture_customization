package com.example.furnitures.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Feasibilitys")
public class Feasibility {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private int feasibilityId;
	
	private int imageId;
	
	private int merchantId;
	
	private String status;
	
	private String comments;
	
}
