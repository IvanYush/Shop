package org.example;

import lombok.Cleanup;
import lombok.SneakyThrows;

import java.io.*;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CashRegister {
    private Product product;

    public Map add (Product product) {
        Map<String, BigDecimal> products = new HashMap<>();
        products.put(product.getName(), product.getPrice());
        return products;
    }
    @SneakyThrows
    public void add2 (String listName, Product... products) {
        @Cleanup FileWriter writer = new FileWriter(listName, true);
        for (Product product : products) {
            writer.write(String.valueOf(product) + "\n");
        }
    }

    public void print (String listName) throws FileNotFoundException {
        String projectPath = "C:\\Users\\yushk\\IdeaProjects\\shop\\";
        String path = projectPath + listName;
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }

}
