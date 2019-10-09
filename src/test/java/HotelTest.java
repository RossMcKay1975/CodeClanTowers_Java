import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;

    private Bedroom bedroom1;
    private Bedroom bedroom2;
    private Bedroom bedroom3;
    private Bedroom bedroom4;

    private ConferenceRoom conferenceRoom1;
    private ConferenceRoom conferenceRoom2;
    private ConferenceRoom conferenceRoom3;
    private ConferenceRoom conferenceRoom4;

    private Guest guest1;
    private Guest guest2;
    private Guest guest3;
    private Guest guest4;

    @Before
    public void before(){
        hotel = new Hotel();

        bedroom1 = new Bedroom(101, 1, "Single sea view");
        bedroom2 = new Bedroom(102, 2, "Double sea view");
        bedroom3 = new Bedroom(103, 4, "Family pool view");
        bedroom4 = new Bedroom(201, 3, "Family no view");

        conferenceRoom1 = new ConferenceRoom(3, "Jura");
        conferenceRoom2 = new ConferenceRoom(2, "Glenlivet");
        conferenceRoom3 = new ConferenceRoom(3, "Coel ila");
        conferenceRoom4 = new ConferenceRoom(10, "Bells");

        guest1 = new Guest("George");
        guest2 = new Guest("Mildred");
        guest3 = new Guest("Mabel");
        guest4 = new Guest("Betty");
    }

    @Test
    public void addBedroomToHotel(){
        hotel.addBedroom(bedroom1);
        hotel.addBedroom(bedroom2);
        hotel.addBedroom(bedroom3);
        assertEquals(3, hotel.countBedrooms());
    }

    @Test
    public void addConferenceRoomToHotel(){
        hotel.addConferenceRoom(conferenceRoom1);
        hotel.addConferenceRoom(conferenceRoom2);
        assertEquals(2, hotel.countConferenceRooms());
    }
}
