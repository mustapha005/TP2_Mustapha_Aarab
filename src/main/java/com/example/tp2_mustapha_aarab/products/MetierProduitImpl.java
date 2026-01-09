package com.example.tp2_mustapha_aarab.products;


import java.util.ArrayList;
import java.util.List;

public class MetierProduitImpl implements IMetier<Product> {
    private List<Product> products;

    public MetierProduitImpl() {
        this.products = new ArrayList<>();
    }

    @Override
    public void add(Product o) {
        products.add(o);
        System.out.println("Product added successfully!");
    }

    @Override
    public List<Product> getAll() {
        return products;
    }

    @Override
    public Product findById(long id) {
        for (Product p : products) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    @Override
    public void delete(long id) {
        Product product = findById(id);
        if (product != null) {
            products.remove(product);
            System.out.println("Product deleted successfully!");
        } else {
            System.out.println("Product not found!");
        }
    }
}