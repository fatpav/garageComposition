import components.Doors;
import components.Seats;
import components.Engine;

public abstract class Vehicle {
    private String vehicleType;
    private Engine engine;
    private Doors doors;
    private Seats seats;
    private String color;
    private double price;

    public Vehicle(Engine engine, Doors doors, Seats seats, String vehicleType, String color, double price){
        this.engine = engine;
        this.doors = doors;
        this.seats = seats;
        this.vehicleType = vehicleType;
        this.color = color;
        this.price = price;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public Engine getEngine() {
        return engine;
    }

    public Doors getDoors() {
        return doors;
    }

    public Seats getSeats() {
        return seats;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }
}
