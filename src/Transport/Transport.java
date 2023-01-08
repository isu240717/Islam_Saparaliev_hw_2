package Transport;

import Color.Color;
import Printable.Printable;

public class Transport implements Printable {
    private String name;
    private Color color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Transport(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    public void print() {
    }
}
