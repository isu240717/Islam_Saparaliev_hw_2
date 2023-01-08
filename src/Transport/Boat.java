package Transport;

import Color.Color;
import Printable.Printable;
public class Boat extends Transport implements Printable {
    private Integer NumberOfSeats;

    public Boat(String name, Color color, Integer numberOfSeats) {
        super(name, color);
        this.NumberOfSeats = numberOfSeats;
    }

    public Integer getNumberOfSeats() {
        return NumberOfSeats;
    }

    public void setNumberOfSeats(Integer numberOfSeats) {
        NumberOfSeats = numberOfSeats;
    }

    @Override
    public void print() {
        System.out.println("Name: " + getName());
        System.out.println("Color.Color: " + getColor());
        System.out.println("Number of seats: " + getNumberOfSeats());
    }
}
