package com.example.genericodelimitados.entities;

public class Product implements Comparable<Product> {
    private String name;
    private Double price;

    public Product(String name, Double price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(Double price){
        this.price = price;
    }

    public String toString(){
        return "name: " + name + ", " + String.format("%.2f", price);
    }

    //Comparando o preço de um produto com outro.
    @Override
    public int compareTo(Product other) {
        return price.compareTo(other.price);
    }
}
