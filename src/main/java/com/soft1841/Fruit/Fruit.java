package com.soft1841.Fruit;

public class Fruit implements Comparable<Fruit> {
    private String name;
    private Double price;

    public Fruit(String name, Double price) {
        this.name = name;
        this.price = price;
    }
    public Fruit(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Fruit fruit) {
        return (int) (this.getPrice() - fruit.getPrice());
    }
}
