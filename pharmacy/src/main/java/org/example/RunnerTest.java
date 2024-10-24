package org.example;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Slf4j
public class RunnerTest {
    public static void main(String[] args) {
        Drug lorotadin = new Drug("Lorotadin", BigDecimal.valueOf(500), true);
        log.trace("name - {}, price - {}, isPrescription - {}",
                lorotadin.getName(), lorotadin.getPrice(), lorotadin.getIsPrescription());
        CashRegister cashRegister = new CashRegister();
        cashRegister.add(lorotadin);
        cashRegister.print();
    }
}