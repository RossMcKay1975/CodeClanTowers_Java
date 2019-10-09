import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(){
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
    }

    public int bedroomCount() {
        return this.bedrooms.size();
    }

    public void addBedroom(Bedroom bedroom1) {
        this.bedrooms.add(bedroom1);
    }

    public int conferenceRoomCount() {
        return this.conferenceRooms.size();
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom1) {
        this.conferenceRooms.add(conferenceRoom1);
    }


    public void addGuestToBedroom(Bedroom bedroom1, Guest guest) {
        bedroom1.addGuest(guest);
    }

    public void addGuestToConferenceRoom(ConferenceRoom conferenceRoom4, Guest guest) {
        conferenceRoom4.addGuest(guest);
    }

    public void removeGuestFromBedroom(Bedroom bedroom3, Guest guest) {
        bedroom3.removeGuest(guest);
    }

    public void removeGuestFromConferenceRoom(ConferenceRoom conferenceRoom2, Guest guest) {
        conferenceRoom2.removeGuest(guest);
    }
}
