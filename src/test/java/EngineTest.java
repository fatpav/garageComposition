import components.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;

    @Before
    public void setUp(){
        engine = new Engine(1.6, 120, "Petrol");
    }

    @Test
    public void engineHasCapacity() {
        assertEquals(1.6, engine.getCapacity(), 0.0);
    }

    @Test
    public void engineHasHorses(){
        assertEquals(120, engine.getHorsePower());
    }

    @Test
    public void enginesFuelTypeIs(){
        assertEquals("Petrol", engine.getFuelType());
    }
}
