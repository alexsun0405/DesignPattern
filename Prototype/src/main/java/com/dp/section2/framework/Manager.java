package com.dp.section2.framework;

import java.util.HashMap;

public class Manager {

    private HashMap showCase = new HashMap();

    public void register(String name, Product product) {
        showCase.put(name, product);
    }

    public Product create(String productName) {
        Product product = (Product) showCase.get(productName);
        return product.createClone();
    }
}
