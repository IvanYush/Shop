package org.example;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Map;

public class Runner {
    public static void main(String[] args) throws FileNotFoundException {
        CashRegister cashRegister1 = new CashRegister();
        CashRegister cashRegister2 = new CashRegister();
        Product milk = new Product("Milk", BigDecimal.valueOf(50));
        Product water = new Product("Water", BigDecimal.valueOf(5));
        Product meat = new Product("Meat", BigDecimal.valueOf(150));

//        Map map = cashRegister1.add(milk);
//        System.out.println(map);

        cashRegister1.add2("first", milk, water, meat);
        cashRegister2.print("first");
    }
}
