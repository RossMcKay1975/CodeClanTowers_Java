import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ConferenceRoomTest {

    private ConferenceRoom conferenceRoom;
    private Guest guest1;
    private Guest guest2;
    private Guest guest3;


    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom(2, "Events Suite");
        guest1 = new Guest("George");
        guest2 = new Guest("Mildred");
        guest3 = new Guest("Mabel");
    }

    @Test
    public void checkCapacity(){
        assertEquals(2, conferenceRoom.getCapacity());
    }

    @Test
    public void checkName(){
        assertEquals("Events Suite", conferenceRoom.getRoomName());
    }

    @Test
    public void canAddGuestToRoom(){
        conferenceRoom.addGuest(guest1);
        assertEquals(1, conferenceRoom.countGuests());
    }

    @Test
    public void cantAddGuestToRoomOverCapacity() {
        conferenceRoom.addGuest(guest1);
        conferenceRoom.addGuest(guest2);
        conferenceRoom.addGuest(guest3);
        assertEquals(2, conferenceRoom.countGuests());
    }
}
