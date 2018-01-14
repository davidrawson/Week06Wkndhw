import java.util.ArrayList;

public class Bedroom extends Room{

//    private ArrayList<Bedroom> bedrooms;
    private ArrayList<Guest> occupants;

    public Bedroom(String roomName, int capacity, String roomType) {
        super(roomName, capacity, roomType);
        occupants = new ArrayList<>();
    }

    public int guestCount() {
        return this.occupants.size();
    }

    public void addGuest(Guest guest) {
        if (guestCount() < capacity) {
            this.occupants.add(guest);
        }
    }

    public ArrayList<Guest> getOccupants() {
        return this.occupants;
    }

    public void checkOutGuests() {
        this.occupants.clear();
    }
}
