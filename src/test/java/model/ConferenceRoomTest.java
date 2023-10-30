
package model;

import model.ConferenceRoom;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


/**
 *
 * @author informatica
 */
public class ConferenceRoomTest {
    
    private ConferenceRoom conferenceTest; 
    
    @BeforeEach
    public void setUp(){
        conferenceTest = new ConferenceRoom("002", 20);
    }
    @Test
    public void testGetId(){
        assertEquals("001", conferenceTest.getId());
    }
    @Test
    public void testGetCapacity(){
        assertEquals(20, conferenceTest.getCapacity());    
    }
    @Test
    public void testIsReserved(){
         assertEquals(false, conferenceTest.isReserved());   
    }
    @Test
    public void testSetReserved(){
        conferenceTest.setReserved(true);
         assertEquals(true, conferenceTest.isReserved()); 
    }
}
