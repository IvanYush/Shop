package org.example;

import java.math.BigDecimal;

public class Runner {
    public static void main(String[] args) {
        CashRegister cashRegister = new CashRegister();
        Food apple = new Food("Apple", BigDecimal.valueOf(100), 50);
        Food pizza = new Food("Pizza", BigDecimal.valueOf(500), 549);

        cashRegister.add2("Food_first", apple, pizza);

    }
}
