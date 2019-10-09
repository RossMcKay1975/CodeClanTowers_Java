import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    private Booking booking;
    private Bedroom bedroom;


    @Before
    public void before(){
        booking = new Booking(3, bedroom );
    }

    @Test
    public void roomBooked(){
        assertEquals(true, booking.bookRoom());
    }

}
