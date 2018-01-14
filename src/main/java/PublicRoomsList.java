public enum PublicRoomsList {
    ONE("The Tom Seleck Dining Room", 85, "Dining Room" ),
    TWO("The Grace Jones Conference Suite", 28, "Conference Hall");

    private final String roomName;
    private final int capacity;
    private final String roomType;

    PublicRoomsList(String roomName, int capacity, String roomType) {
        this.roomName = roomName;
        this.capacity = capacity;
        this.roomType = roomType;
    }

    public String getRoomName() {
        return this.roomName;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public String getRoomType(){
        return this.roomType;
    }
}
