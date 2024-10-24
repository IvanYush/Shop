package org.example;

import lombok.*;

import java.math.BigDecimal;

/**
 * Еда
 */
@ToString(callSuper = true)
public class Food extends Product {
    @NonNull
    @Getter
    @Setter
    private Integer calories;

    public Food(String name, BigDecimal price, Integer calories) {
        super(name, price);
        this.calories = calories;
    }
}