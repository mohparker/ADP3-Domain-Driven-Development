/* AirportRepositoryTest.java
 * Test for AirportRepository
 * Author: Mary-Beth Agulhas
 * Date: 5 April 2022
 */
package za.ac.cput.Repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.Entity.Airport;
import za.ac.cput.Factory.AirportFactory;


import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class AirportRepositoryTest {
    private static AirportRepository repository= AirportRepository.getRepository();
    private static Airport airport = AirportFactory
            .createAirport("zxcv","Cape Town International");

    @Test
    void f_create() {
        Airport created = repository.create(airport);
        assertEquals(airport.getAirportId(), created.getAirportId());
        System.out.println("Created: " + created);
    }

    @Test
    void g_read() {
        Airport read = repository.read(airport.getAirportId());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void h_update() {
        Airport updated = new Airport.Builder().copy(airport)
                .setFlightCode("xvcb")
                .setAirportName("Oliver Tambo")
                .build();
        assertNotNull(repository.update(updated));
        System.out.println("Updated: "+ updated);
    }

    @Test
    void j_delete() {
        boolean success = repository.delete(airport.getAirportId());
        assertTrue(success);
        System.out.println("Deleted: " + success);
    }

    @Test
    void i_getAll() {
        System.out.println("Show all");
        System.out.println(repository.getAll());
    }
}