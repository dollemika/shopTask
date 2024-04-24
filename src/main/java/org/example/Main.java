package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Cart c = context.getBean("cart", Cart.class);
        c.addPoduct(context.getBean("productservice", ProductService.class).findByName("product3"));
        c.addPoduct(context.getBean("productservice", ProductService.class).findByName("product7"));
        System.out.println(c);
    }
}