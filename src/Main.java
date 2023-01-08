import Color.Color;
import Transport.*;

public class Main {
    public static void main(String[] args) {
        Transport car = createObject("Transport.Car");
        car.print();
        System.out.println("______________________________");
        Transport boat = createObject("Transport.Boat");
        boat.print();
        System.out.println("______________________________");
        Transport plane = createObject("Transport.Plane");
        plane.print();
    }

    public static Transport createObject(String className) {
        switch (className) {
            case "Transport.Car":
                return new Car("Transport.Car", Color.BLACK, "Mercedes");
            case "Transport.Boat":
                return new Boat("Transport.Boat", Color.GRAY, 6);
            case "Transport.Plane":
                return new Plane("Transport.Plane", Color.WHITE, 10000);
            default:
                return null;
        }
    }
}