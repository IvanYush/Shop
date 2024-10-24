package org.example;

import lombok.Data;
import lombok.NonNull;

import java.math.BigDecimal;

/**
 * Продукт
 */
@Data
public class Product {
    @NonNull
    private String name;
    @NonNull
    private BigDecimal price;
}