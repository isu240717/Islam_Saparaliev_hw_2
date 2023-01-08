package Transport;

import Color.Color;

import Printable.Printable;

public class Car extends Transport implements Printable {
    private String brand;

    public Car(String name, Color color, String brand) {
        super(name, color);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void print() {
        System.out.println("Name: " + getName());
        System.out.println("Color.Color: " + getColor());
        System.out.println("Brand: " + getBrand());
    }
}
