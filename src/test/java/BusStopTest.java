import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    BusStop busStop;
    Person person;

    @Before
    public void before(){
        busStop = new BusStop("Glasgow");
        person = new Person ();
    }

    @Test
    public void busStopHasName(){
        assertEquals("Glasgow", busStop.getName());
    }

    @Test
    public void busStopQueueStartsEmpty(){
        assertEquals(0, busStop.queueCount());
    }

    @Test
    public void canAddPassengerToQueue(){
        busStop.addPassenger(person);
        assertEquals(1, busStop.queueCount());
    }

    @Test
    public void canRemovePassengerToQueue(){
        busStop.addPassenger(person);
        busStop.removePassenger(person);
        assertEquals(0, busStop.queueCount());
    }

}
