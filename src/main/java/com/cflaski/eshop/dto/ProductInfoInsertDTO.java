package com.cflaski.eshop.dto;

import com.cflaski.eshop.core.enums.PaymentStatus;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ProductInfoInsertDTO(
        @NotBlank(message = "Color is required")
        String color,

        @NotBlank(message = "Size is required")
        String size,

        @NotNull(message = "Product ID is required")
        Long productId
) {
}
