package com.cflaski.eshop.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CategoryInsertDTO(
        @NotBlank(message = "Color is required")
        String color,

        @NotBlank(message = "Size is required")
        String size,

        @NotNull(message = "productId is required")
        Long productId
) {
}
