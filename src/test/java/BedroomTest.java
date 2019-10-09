import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom;
    private Guest guest1;


    @Before
    public void before(){
        bedroom = new Bedroom(101, 1, "single");
        guest1 = new Guest ("George");
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

}
