package org.example;

import java.util.ArrayList;

public class ProductService {
    ArrayList<Product> products = new ArrayList<>();

    public ProductService() {
        for (int i=0; i<10; i++)
            products.add(new Product(i+1,"product"+(i+1),i*10.0));
    }
    public void writeToConsole(){
        System.out.println(products);
    }

    @Override
    public String toString() {
        return "ProductService{" +
                "products=" + products +
                '}';
    }

    public Product findByName(String n){
        for(int i = 0; i<products.size(); i++){
            if (products.get(i).name.equals(n)){
                return products.get(i);
            }
        }
        return null;
    }
}
