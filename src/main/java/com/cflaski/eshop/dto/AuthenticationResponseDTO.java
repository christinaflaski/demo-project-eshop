package com.cflaski.eshop.dto;


import com.cflaski.eshop.core.enums.Role;

public record AuthenticationResponseDTO(String firstname, String lastname, Role role, String token) {}
