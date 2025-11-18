package com.cflaski.eshop.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Table(name = "products_info")
public class ProductInfo extends AbstractEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String color;

    private String size;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;
}
