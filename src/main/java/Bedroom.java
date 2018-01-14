import java.util.ArrayList;

public class Bedroom extends Room{

    private ArrayList<Bedroom> bedroooms;
    private ArrayList<Guest> occupants;

    public Bedroom(String roomName, int capacity, String roomType) {
        super(roomName, capacity, roomType);
        occupants = new ArrayList<>();
    }

    public int guestCount() {
        return occupants.size();
    }

    public void addGuest(Guest guest) {
        if (guestCount() < capacity) {
            occupants.add(guest);
        }
    }

    public void checkOutGuests() {
        occupants.clear();
    }
}
