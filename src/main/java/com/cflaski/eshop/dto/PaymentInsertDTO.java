package com.cflaski.eshop.dto;

import com.cflaski.eshop.core.enums.PaymentMethod;
import com.cflaski.eshop.core.enums.PaymentStatus;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;

public record PaymentInsertDTO(
        @NotNull(message = "Payment method is required")
        PaymentMethod method,

        @Size(min = 4, max = 4, message = "Must be 4 digits")
        String cardLastFourNumbers,

        @NotNull(message = "Payment amount is required")
        BigDecimal amount,

        @NotNull(message = "Payment status is required")
        PaymentStatus status,

        @NotNull(message = "Order ID is required")
        Long orderId
) {
}
