package com.cflaski.eshop.dto;

import com.cflaski.eshop.core.enums.Role;

import java.util.Set;

public record UserReadOnlyDTO(
        Long id,
        String firstname,
        String lastname,
        String email,
        boolean isActive,
        Role role,
        Set<String> orders,
        String phoneNumber) {
}
