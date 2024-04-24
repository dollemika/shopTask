package org.example;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean (name="cart")
    public Cart cart(){
        return new Cart();
    }
    @Bean (name="order")
    public OrderService orderservice(){
        return new OrderService();
    }
    @Bean (name="productservice")
    public ProductService productservice(){
        return new ProductService();
    }
}
