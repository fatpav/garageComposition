import components.Doors;
import components.Engine;
import components.Seats;

public class ElectricCar extends Vehicle {

    private String chargingTime;

    public ElectricCar(Engine engine, Doors doors, Seats seats, String vehicleType, String model, String color, double price, String chargingTime){
        super(engine, doors, seats, vehicleType, model, color, price);
        this.chargingTime = chargingTime;
    }

    public String getChargingTime() {
        return chargingTime;
    }
}
