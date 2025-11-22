package com.cflaski.eshop.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CategoryUpdateDTO(
        @NotNull
        Long id,

        @NotBlank(message = "Color is required")
        String color,

        @NotBlank(message = "Size is required")
        String size
) {
}
