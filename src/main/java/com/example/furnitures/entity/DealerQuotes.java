package com.example.furnitures.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "DealerQuotes")
public class DealerQuotes {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private int DealerQuotesId;
	
	@OneToMany
	private Feasibility feasibility;
	
	private Merchant merchant;
	
	private int price;
	
	private Date estimatedDelivery;
	

}
