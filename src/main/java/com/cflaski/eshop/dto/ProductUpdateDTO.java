package com.cflaski.eshop.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record ProductUpdateDTO(
        @NotNull
        Long id,

        @NotBlank(message = "Name is required")
        String name,

        String description,

        String image,

        @NotNull(message = "In stock is required")
        int inStock,

        @NotNull(message = "Price is required")
        BigDecimal price,
        Boolean isActive,

        @NotNull(message = "Category ID is required")
        Long categoryId

) {
}
