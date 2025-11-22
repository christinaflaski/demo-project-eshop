package com.cflaski.eshop.dto;

import com.cflaski.eshop.core.enums.OrderStatus;
import jakarta.validation.constraints.NotNull;

public record OrderUpdateDTO(
        @NotNull
        Long id,

        @NotNull(message = "Order status is required")
        OrderStatus status

) {
}
