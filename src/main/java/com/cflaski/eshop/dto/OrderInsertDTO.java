package com.cflaski.eshop.dto;

import com.cflaski.eshop.core.enums.OrderStatus;
import com.cflaski.eshop.model.Address;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record OrderInsertDTO(
        @NotNull(message = "Price is required")
        BigDecimal price,

        @NotNull(message = "Total price is required")
        BigDecimal totalPrice,

        @NotNull(message = "Shipping price is required")
        BigDecimal shippingPrice,

        @NotNull(message = "Shipping address is required")
        Address shippingAddress,

        @NotNull(message = "Order status is required")
        OrderStatus status,

        @NotNull(message = "User details is required")
        UserInsertDTO user


) {
}
