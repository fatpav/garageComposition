import components.Doors;
import components.Engine;
import components.Seats;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealerTest {

    Vehicle vehicle;
    Dealership dealership;
    Engine engine;
    Doors doors;
    Seats seats;

    @Before
    public void setUp(){
        dealership = new Dealership();
        engine = new Engine(1.6, 260, "Diesel");
        doors = new Doors(4);
        seats = new Seats(5);
        vehicle = new Car(engine, doors, seats, "diesel", "Ford", "red", 100);
    }

    @Test
    public void dealerHasNoCars(){
        assertEquals(0, dealership.getStock());
    }

    @Test
    public void dealerHasNoMoney(){
        assertEquals(0.00, dealership.getTill(), 0.00);
    }

    @Test
    public void dealerCanAddCarToStock(){
        dealership.addVehicle(vehicle);
        assertEquals(1, dealership.getStock());
    }

    @Test
    public void dealerCanGetThatPaper(){
        dealership.getPayment(vehicle.getPrice());
        assertEquals(100, dealership.getTill(), 0.00);

    }

    @Test
    public void dealerCanBuyCar(){
        dealership.buyVehicle(vehicle);
        assertEquals(100, dealership.getTill(), 0.00);
        assertEquals(1, dealership.getStock());
    }


}
