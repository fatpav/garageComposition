import components.Seats;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SeatsTest {
    Seats seats;

    @Before
    public void setUp(){
        seats = new Seats(5);
    }

    @Test
    public void hasSeats() {
        assertEquals(5, seats.getSeatNum());
    }
}
