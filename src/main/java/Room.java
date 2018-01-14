import java.util.ArrayList;

public class Room {

    protected ArrayList<Room> rooms;
    protected String roomName;
    protected int capacity;
    protected String roomType;

    public Room(String roomName, int capacity, String roomType){
        rooms = new ArrayList<>();
        this.roomName = roomName;
        this.capacity = capacity;
        this.roomType = roomType;

    }


    public void addRoom(Room room) {
        rooms.add(room);
    }

    public int countRooms() {
        return rooms.size();
    }

    public String getRoomName() {
        return this.roomName;
    }


    public int getCapacity() {
        return this.capacity;
    }

    public String getRoomType() {
        return this.roomType;
    }
}
