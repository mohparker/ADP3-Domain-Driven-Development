package za.ac.cput.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.Flight;

import static org.junit.jupiter.api.Assertions.*;

class FlightFactoryTest {
        @Test
        public void test(){
            Flight flight= FlightFactory.createFlight("Departure Date:28th April"+"\n"+"Arrival Date: 2nd May","20:20PM-22:20PM",50);
            System.out.println(flight.toString());
            assertNotNull(flight);
        }
}