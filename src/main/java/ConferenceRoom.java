import java.util.ArrayList;

public class ConferenceRoom {

    private int capacity;
    private String roomName;
    private ArrayList<Guest> guests;

    public ConferenceRoom(int capacity, String roomName){
        this.capacity = capacity;
        this.roomName = roomName;
        this.guests = new ArrayList<Guest>();
    }

    public int getCapacity() {
        return this.capacity;
    }

    public String getRoomName() {
        return this.roomName;
    }

    public void addGuest(Guest guest1) {
        if (this.capacity > this.countGuests()){
            this.guests.add(guest1);
        }
    }

    public int countGuests(){
        return this.guests.size();
    }

    public void removeGuest(Guest guest) {
        this.guests.remove(guest);
    }
}

