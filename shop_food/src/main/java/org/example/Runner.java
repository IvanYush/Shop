package org.example;

import java.math.BigDecimal;

public class Runner {
    public static void main(String[] args) {
        Food apple = new Food("Apple", BigDecimal.valueOf(100), 50);
        Food pizza = new Food("Pizza", BigDecimal.valueOf(500), 549);
        CashRegister cashRegister = new CashRegister();
        cashRegister.add(apple, pizza);
        cashRegister.print();

    }
}
