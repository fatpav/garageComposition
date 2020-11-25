import components.Doors;
import components.Seats;
import components.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {
    Car car;
    Engine engine;
    Doors doors;
    Seats seats;

    @Before
    public void setUp() {
        engine = new Engine(1.6, 260, "Diesel");
        doors = new Doors(4);
        seats = new Seats(5);
        car = new Car(engine, doors, seats, "diesel", "Ford", "red", 100);
    }

    @Test
    public void getEngineSize(){
        assertEquals(1.6, car.getEngine().getCapacity(), 0.0);
    }

    @Test
    public void getDoorsNumber() {
        assertEquals(4, car.getDoors().getDoorCount());
    }

    @Test
    public void getHorses(){
        assertEquals(260, car.getEngine().getHorsePower());
    }

    @Test
    public void hasModelType() {
        assertEquals("Ford", car.getModel());
    }
}
