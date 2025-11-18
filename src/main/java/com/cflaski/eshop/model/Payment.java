package com.cflaski.eshop.model;

import com.cflaski.eshop.core.enums.PaymentMethod;
import com.cflaski.eshop.core.enums.PaymentStatus;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Table(name = "payments")
public class Payment extends AbstractEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PaymentMethod method;

    @Column(length = 4)
    private String cardLastFourNumbers;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PaymentStatus status;

    @Column(nullable = false)
    private BigDecimal amount;

    @Column(nullable = false, unique = true)
    private String paymentToken;

    @Column(nullable = false, unique = true)
    private String paymentId;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
}
