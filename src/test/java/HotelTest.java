import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom;
    Guest guest1;
    Guest guest2;
    ArrayList<Guest> occupants;

    @Before
    public void Before(){
        hotel = new Hotel();
        bedroom = new Bedroom("Presidential Suite", 4, "Suite" );
        guest1 = new Guest("President Abe 'Vampire Killer' Lincoln", 3);
        guest2 = new Guest("First Lady Lincoln", 3);
        occupants = new ArrayList<>();
        this.occupants.add(guest1);
        this.occupants.add(guest2);
    }

    @Test
    public void hasTenBedrooms(){
        assertEquals(10, hotel.countBedrooms());
    }


    @Test
    public void hasTwoPublicRooms(){
        assertEquals(2, hotel.countPublicRooms());
    }

    @Test
    public void canGetBedroom(){
        assertEquals("Presidential Suite", hotel.getBedroom("Presidential Suite").getRoomName());

    }

    @Test
    public void canCheckInGuest(){
        hotel.checkIn(guest1, bedroom);
        assertEquals(1, bedroom.guestCount());
    }

    @Test
    public void canCheckOutGuest(){
        hotel.checkIn(guest1, bedroom);
        hotel.checkOut(bedroom);
        assertEquals(0, bedroom.guestCount());
    }


    @Test
    public void canGetOccupants(){
        hotel.checkIn(guest1, bedroom);
        hotel.checkIn(guest2, bedroom);
        assertEquals(2, hotel.getOccupants(bedroom).size());
    }

    @Test
    public void canGetNoOccupants(){
        assertEquals(0, hotel.getOccupants(bedroom).size());
    }

    @Test
    public void canListVacantBedrooms(){
//        bedroom = hotel.getBedroom("Presidential Suite");
        bedroom = hotel.getBedroom(BedroomsList.SEVEN.getRoomName());
        hotel.checkIn(guest1, bedroom);
        assertEquals(9, hotel.getVacantBedrooms().size());
    }

}
