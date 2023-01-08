package Transport;
import Color.Color;
import Printable.Printable;
public class Plane extends Transport implements Printable {
    private Integer FlightAltitude;

    public Plane(String name, Color color, Integer flightAltitude) {
        super(name, color);
        this.FlightAltitude = flightAltitude;
    }

    public Integer getFlightAltitude() {
        return FlightAltitude;
    }

    public void setFlightAltitude(Integer flightAltitude) {
        FlightAltitude = flightAltitude;
    }

    @Override
    public void print() {
        System.out.println("Name: " + getName());
        System.out.println("Color.Color: " + getColor());
        System.out.println("Flight altitude in meters: " + getFlightAltitude());
    }
}
