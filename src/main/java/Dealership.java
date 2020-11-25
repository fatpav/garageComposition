import java.util.ArrayList;

public class Dealership {

    private ArrayList<Vehicle> stock;
    private double till;

    public Dealership(){
        this.till = till;
        this.stock = new ArrayList<Vehicle>();
    }

    public int getStock() {
        return this.stock.size();
    }

    public double getTill() {
        return till;
    }

    public void addVehicle(Vehicle vehicle){
        this.stock.add(vehicle);
    }
}
