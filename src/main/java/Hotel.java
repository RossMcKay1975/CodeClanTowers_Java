import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(){
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
    }

    public int countBedrooms() {
        return this.bedrooms.size();
    }

    public void addBedroom(Bedroom bedroom1) {
        this.bedrooms.add(bedroom1);
    }

    public int countConferenceRooms() {
        return this.conferenceRooms.size();
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom1) {
        this.conferenceRooms.add(conferenceRoom1);
    }
}
