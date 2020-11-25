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
        doors = new Doors(5);
        seats = new Seats(4);
        car = new Car(engine, doors, seats, "diesel", "Ford");
    }

    @Test
    public void getEngineSize(){
        assertEquals(1.6, car.getEngine().getCapacity(), 0.0);
    }
}
