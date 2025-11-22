package com.cflaski.eshop.dto;

import java.math.BigDecimal;
import java.util.Set;

public record ProductReadOnlyDTO(
        Long id,
        String name,
        String description,
        int inStock,
        String image,
        BigDecimal price,
        boolean isActive,
        Set<OrderItemReadOnlyDTO> orderItems,
        Set<ProductInfoReadOnlyDTO> productInfos,
        CategoryReadOnlyDTO category) {
}
