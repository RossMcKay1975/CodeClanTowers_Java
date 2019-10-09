import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom;
    private Guest guest1;
    private Guest guest2;


    @Before
    public void before(){
        bedroom = new Bedroom(101, 1, "single", true);
        guest1 = new Guest ("George");
        guest2 = new Guest ( "Mildred");
    }

    @Test
    public void canCheckCapacity(){
        assertEquals(1, bedroom.hasCapacity());
    }

    @Test
    public void canCheckHasRoomNumber(){
        assertEquals(101, bedroom.getRoomNo());
    }

    @Test
    public void checkTypeOfRoom(){
        assertEquals("single", bedroom.getRoomType());
    }

    @Test
    public void canAddGuestToRoom(){
        bedroom.addGuest(guest1);
        assertEquals(1, bedroom.countGuests());
    }

    @Test
    public void cantAddGuestToRoomOverCapacity(){
        bedroom.addGuest(guest1);
        bedroom.addGuest(guest2);
        assertEquals(1, bedroom.countGuests());

    }
}
