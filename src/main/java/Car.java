import components.Doors;
import components.Engine;
import components.Seats;

public class Car extends Vehicle {
    private String model;

    public Car(Engine engine, Doors doors, Seats seats, String vehicleType, String model, String color, double price) {
        super(engine, doors, seats, vehicleType, color, price);
        this.model = model;
    }

    public String getModel(){
        return this.model;
    }

}
