import components.Doors;
import components.Engine;
import components.Seats;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {

    ElectricCar electricCar;
    Engine engine;
    Doors doors;
    Seats seats;

    @Before
    public void setUp() {
        engine = new Engine(150, 200, "Electric");
        doors = new Doors(4);
        seats = new Seats(5);
        electricCar = new ElectricCar(engine, doors, seats, "diesel", "Tesla", "red", 90, "8 hours");
    }

    @Test
    public void getEngineSize(){
        assertEquals(150, electricCar.getEngine().getCapacity(), 0.0);
    }

    @Test
    public void getDoorsNumber() {
        assertEquals(4, electricCar.getDoors().getDoorCount());
    }

    @Test
    public void getHorses(){
        assertEquals(200, electricCar.getEngine().getHorsePower());
    }

    @Test
    public void hasModelType() {
        assertEquals("Tesla", electricCar.getModel());
    }

    @Test
    public void hasPrice(){
        assertEquals(90, electricCar.getPrice(), 0.0);
    }
}