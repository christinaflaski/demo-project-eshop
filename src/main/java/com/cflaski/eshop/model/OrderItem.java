package com.cflaski.eshop.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Table(name = "order_items")
public class OrderItem extends AbstractEntity{

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
}
