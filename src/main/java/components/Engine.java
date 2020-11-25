package components;

public class Engine {

    private double capacity;
    private int horsePower;
    private String fuelType;

    public Engine(double capacity, int horsePower, String fuelType) {
        this.capacity = capacity;
        this.horsePower = horsePower;
        this.fuelType = fuelType;
    }

    public double getCapacity() {
        return capacity;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public String getFuelType() {
        return fuelType;
    }
}
