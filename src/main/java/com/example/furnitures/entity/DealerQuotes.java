package com.example.furnitures.entity;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "DealerQuotes")
public class DealerQuotes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long quoteId;

    @ManyToOne
    @JoinColumn(name = "image_id")
    private GeneratedImages generatedImages;

    @ManyToOne
    @JoinColumn(name = "merchant_id")
    private Merchant merchant;

    private Boolean feasibility;
    private BigDecimal price;
    private String estimatedDelivery;
    private String comments;
}
