package com.matheusmangueira.microserviceusers.dtos;

import java.math.BigDecimal;

public record UserDTO(
    String name,
    String email,
    BigDecimal balance
) {}
