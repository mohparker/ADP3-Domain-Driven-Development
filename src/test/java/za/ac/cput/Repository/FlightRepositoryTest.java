/* FlightRepositoryTest.java
 Repository for the FlightRepositoryTest
 Author: Daniel Marais (219476845)
 Date: 30 March 2022
*

 */
package za.ac.cput.Repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.Entity.Flight;
import za.ac.cput.Factory.FlightFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class FlightRepositoryTest {
    private static FlightRepository repository = FlightRepository.getRepository();
    private static Flight flight= FlightFactory.createFlight("Departure Date:28th April"+"\n"+"Arrival Date: 2nd May","20:20PM-22:20PM",50);
    @Test
    void a_create(){
        Flight created= repository.create(flight);
        assertEquals(flight.getFlightId(),created.getFlightId());
        System.out.println("Created: "+ created);
    }
    @Test
    void b_read(){
        Flight read= repository.read(flight.getFlightId());
        assertNotNull(read);
        System.out.println("Read: "+read);
    }
    @Test
    void c_update(){
        Flight updated= new Flight.Builder().copy(flight).setDateOfFlight("Departure Date:29th April"+"\n"+"Arrival Date: 5nd May")
                .setTimeOfFlight("18:20PM-20:20PM")
                .builder();
        assertNotNull(repository.update(updated));
        System.out.println("Updated: "+ updated);
    }
    @Test
    void e_delete(){
        boolean success= repository.delete(flight.getFlightId());
        assertTrue(success);
        System.out.println("Delete: "+ success);
    }
    @Test
    void d_getAll(){
        System.out.println("Show all:");
        System.out.println(repository.getAll());
    }
}