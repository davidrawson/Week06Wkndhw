import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest;

    @Before
    public void Before(){
        bedroom = new Bedroom("1", 1, "Bedroom");
        guest = new Guest("Jon Snow", 2);
    }

    @Test
    public void canAddGuestsToCapacity(){

        bedroom.addGuest(guest);
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.guestCount());

    }

    @Test
    public void canCheckOutGuests(){
        bedroom.addGuest(guest);
        bedroom.checkOutGuests();
        assertEquals(0, bedroom.guestCount());

    }


}
