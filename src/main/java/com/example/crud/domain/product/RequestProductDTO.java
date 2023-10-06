package com.example.crud.domain.product;

import jakarta.validation.constraints.*;

public record RequestProductDTO(String id, @NotBlank  String name, @NotNull Integer price_in_cents) {
}
