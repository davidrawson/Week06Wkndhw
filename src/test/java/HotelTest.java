import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;

    @Before
    public void Before(){
        hotel = new Hotel();
    }

    @Test
    public void hasTenBedrooms(){
        assertEquals(10, hotel.countBedrooms());
    }

}
