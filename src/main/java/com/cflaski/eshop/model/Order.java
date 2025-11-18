package com.cflaski.eshop.model;

import com.cflaski.eshop.core.enums.OrderStatus;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Table(name = "orders")
public class Order extends AbstractEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private OrderStatus status;


    @Column(nullable = false)
    private BigDecimal price = BigDecimal.ZERO;
    private BigDecimal totalPrice = BigDecimal.ZERO;
    private BigDecimal shippingPrice = BigDecimal.ZERO;

    @Embedded
    private Address shippingAddress;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<OrderItem> items = new HashSet<>();

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Payment> payments = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @PrePersist
    public void initStatus() {
        if (status == null) {
            status = OrderStatus.PENDING;
        }
    }

    public void totalPriceInit() {
        totalPrice = price.add(shippingPrice);
    }

    public void addPayment(Payment payment) {
        payments.add(payment);
        payment.setOrder(this);
    }

    public void removePayment(Payment payment) {
        payments.remove(payment);
        payment.setOrder(null);
    }

    public void addOrderItem(OrderItem item) {
        items.add(item);
        item.setOrder(this);
    }

    public void removeOrderItem(OrderItem item) {
        items.remove(item);
        item.setOrder(null);
    }



}
