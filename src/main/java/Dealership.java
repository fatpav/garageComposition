import java.util.ArrayList;

public class Dealership implements IBuy {

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

    public void getPayment(double price){
        this.till =+ price;
    }

    public void buyVehicle(Vehicle vehicle){
        addVehicle(vehicle);
        getPayment(vehicle.getPrice());
    }
}
