package org.example;

import java.math.BigDecimal;
import java.util.HashMap;

/**
 * Касса
 */
public class CashRegister {
    private HashMap<String, BigDecimal> productsList = new HashMap<>();

    /**
     * Добавляем продукты в кассу
     */
    public void add (Product... products) {
        for (Product product : products) {
            productsList.put(product.getName(), product.getPrice());
        }
    }

    /**
     * Печать списка продуктов добавленных в кассу
     */
    public void print () {
        System.out.println(productsList);
    }
}