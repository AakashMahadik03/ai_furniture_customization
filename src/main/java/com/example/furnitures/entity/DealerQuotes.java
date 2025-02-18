package com.example.furnitures.entity;

import java.util.Date;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "DealerQuotes")
public class DealerQuotes {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private int DealerQuotesId;
	
	@ManyToAny
	private Feasibility feasibility;
	
	private Merchant merchant;
	
	private int price;
	
	private Date estimatedDelivery;
	

}
