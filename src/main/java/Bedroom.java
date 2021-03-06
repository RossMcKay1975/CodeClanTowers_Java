import java.util.ArrayList;

public class Bedroom {

    private int roomNo;
    private int capacity;
    private String typeOfRoom;
    private ArrayList<Guest> guests;
    private boolean booked;

    public Bedroom(int roomNo, int capacity, String typeOfRoom, boolean booked) {
        this.roomNo = roomNo;
        this.capacity = capacity;
        this.typeOfRoom = typeOfRoom;
        this.guests = new ArrayList<Guest>();
        this.booked = booked;
    }


    public int hasCapacity() {
        return this.capacity;
    }

    public int getRoomNo() {
        return this.roomNo;
    }

    public String getRoomType() {
        return this.typeOfRoom;
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

    public void checkRoomBooked()
}