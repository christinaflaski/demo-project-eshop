package com.cflaski.eshop.dto;

import java.math.BigDecimal;

public record OrderItemReadOnlyDTO(
        Long id,
        OrderReadOnlyDTO order,
        int quantity,
        BigDecimal price,
        BigDecimal tax,
        BigDecimal totalPrice,
        ProductReadOnlyDTO product) {
}
