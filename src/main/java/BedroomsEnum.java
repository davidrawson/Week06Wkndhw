public enum BedroomsEnum {
    ONE("1", 1, "Single"),
    TWO("2", 2, "Double"),
    THREE("3", 1, "Single"),
    FOUR("4", 2, "Double"),
    FIVE("5", 1, "Single"),
    SIX("6", 2, "Double"),
    SEVEN("Presidential Suite", 4, "Suite" ),
    EIGHT("8", 4, "Family"),
    NINE("9", 4, "Family"),
    TEN("Marital Suite", 2, "Suite");

    private final String roomName;
    private final int capacity;
    private final String roomType;

    BedroomsEnum(String roomName, int capacity, String roomType) {
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
