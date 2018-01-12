import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;

    @Before
    public void Before(){

        room = new Room("1", 1, "Bedroom");

    }

    @Test
    public void canAddRoom(){
        room.addRoom(room);
        assertEquals(1, room.countRooms());
    }

    @Test
    public void canGetRoomName(){
        assertEquals("1", room.getRoomName());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(1, room.getCapacity());
    }

    @Test
    public void canGetRoomType(){
        assertEquals("Bedroom", room.getRoomType());
    }
}
