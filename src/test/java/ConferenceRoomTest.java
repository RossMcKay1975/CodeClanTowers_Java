import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ConferenceRoomTest {

    private ConferenceRoom conferenceRoom;
    private Guest guest1;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom(20, "Events Suite");
        guest1 = new Guest("George");
    }

    @Test
    public void checkCapacity(){
        assertEquals(20, conferenceRoom.getCapacity());
    }

    @Test
    public void checkName(){
        assertEquals("Events Suite", conferenceRoom.getRoomName()); 
    }
}
