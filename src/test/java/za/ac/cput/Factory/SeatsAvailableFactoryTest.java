package za.ac.cput.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.SeatsAvailable;

import static org.junit.jupiter.api.Assertions.*;

public class SeatsAvailableFactoryTest {
    @Test
    public void test(){
        SeatsAvailable seatsAvailable = SeatsAvailableFactory.createSeatsAvailable(2,"F",2);
        System.out.println(seatsAvailable.toString());
        assertNotNull(seatsAvailable);
    }

}