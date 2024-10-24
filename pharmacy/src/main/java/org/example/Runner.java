package org.example;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Slf4j
public class Runner {
    public static void main(String[] args) {
        Drug paracetamol = new Drug("Paracetamol", BigDecimal.valueOf(250), false);
        log.trace("name - {}, price - {}, isPrescription - {}",
                paracetamol.getName(), paracetamol.getPrice(), paracetamol.getIsPrescription());
        CashRegister cashRegister = new CashRegister();
        cashRegister.add(paracetamol);
        cashRegister.print();
    }
}