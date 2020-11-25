import components.Doors;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DoorTest {

    Doors doors;

    @Before
    public void setUp() {
        doors = new Doors(4);
    }

    @Test
    public void carHasDoors() {
        assertEquals(4, doors.getDoorCount());
    }
}
