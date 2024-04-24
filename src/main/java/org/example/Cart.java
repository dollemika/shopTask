package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
@Component
public class Cart {
    @Override
    public String toString() {
        return "Cart{" +
                "cart=" + cart +
                '}';
    }

    ArrayList<Product> cart = new ArrayList<>();
    public void addPoduct(Product x){
        cart.add(x);
    }
}
