package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
@Component
public class OrderService {
    @Autowired
    Cart cart;
    public void makeOrder(){
        System.out.println(cart);
        double sum = 0.0;
        for(Product x: cart.cart)
            sum+=x.cost;
        System.out.println(sum);
        cart.cart = null;
    }
}
