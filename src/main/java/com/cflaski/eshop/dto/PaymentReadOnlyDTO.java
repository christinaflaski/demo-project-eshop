package com.cflaski.eshop.dto;

import com.cflaski.eshop.core.enums.PaymentMethod;
import com.cflaski.eshop.core.enums.PaymentStatus;

import java.math.BigDecimal;

public record PaymentReadOnlyDTO(
        Long id,
        PaymentStatus status,
        PaymentMethod method,
        BigDecimal amount,
        OrderReadOnlyDTO order) {
}
