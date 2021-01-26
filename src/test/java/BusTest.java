import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {
    private Bus bus;
    private Person person;
    private BusStop busStop;


    @Before
    public void before(){
        bus = new Bus("Glasgow", 10);
        person = new Person();
        busStop = new BusStop("Glasgow");
        busStop.addPassenger(person);
        busStop.addPassenger(person);
        busStop.addPassenger(person);
    }

    @Test
    public void busHasDestination(){
        assertEquals("Glasgow", bus.getDestination());
    }

    @Test
    public void busHasCapacity(){
        assertEquals(10, bus.getCapacity());
    }

    @Test
    public void busPassengersStartEmpty(){
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void canAddPassengersToBus(){
        bus.addPassenger(person);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void canRemovePassengersToBus(){
        bus.addPassenger(person);
        bus.removePassenger(person);
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void busCanPickUpFromBusStop(){
        bus.pickUp(person);

    }

}
