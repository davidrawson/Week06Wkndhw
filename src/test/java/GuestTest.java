import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest;

    @Before
    public void Before(){
        guest = new Guest("Jon Snow", 2);
    }

    @Test
    public void hasName(){
        assertEquals("Jon Snow", guest.getName());
    }

}
