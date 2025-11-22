package com.cflaski.eshop.dto;

import com.cflaski.eshop.core.enums.OrderStatus;
import com.cflaski.eshop.model.Address;

import java.math.BigDecimal;
import java.util.Set;

public record OrderReadOnlyDTO(
        Long id,
        OrderStatus status,
        BigDecimal price,
        BigDecimal totalprice,
        BigDecimal shippingPrice,
        Address shippingAddress,
        UserReadOnlyDTO user,
        Set<OrderItemReadOnlyDTO> items,
        Set<PaymentReadOnlyDTO> payments) {
}
