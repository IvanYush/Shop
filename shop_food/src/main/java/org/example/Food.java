package org.example;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@ToString(callSuper = true)
@Getter
@Setter
public class Food extends Product {
    private int calories;

    public Food(String name, BigDecimal price, int calories) {
        super(name, price);
        this.calories = calories;
    }

}
