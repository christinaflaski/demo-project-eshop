package com.cflaski.eshop.dto;

import jakarta.validation.constraints.NotBlank;

public record ProductInfoUpdateDTO(
        @NotBlank(message = "Color is required")
        String color,

        @NotBlank(message = "Size is required")
        String size
){
}
