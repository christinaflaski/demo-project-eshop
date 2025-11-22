package com.cflaski.eshop.dto;

public record ProductInfoReadOnlyDTO(
        Long id,
        String color,
        String size,
        ProductReadOnlyDTO product) {
}
