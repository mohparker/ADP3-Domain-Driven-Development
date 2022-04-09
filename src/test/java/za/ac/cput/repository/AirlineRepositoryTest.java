package za.ac.cput.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.Entity.Airline;
import za.ac.cput.Factory.AirlineFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class AirlineRepositoryTest {
    private static AirlineRepository repository =  AirlineRepository.getRepository();
    private static Airline airline = AirlineFactory.createAirline(9874, 10, 8, "Mango");

    @Test
    void a_create() {
        Airline created = repository.create(airline);
        assertEquals(airline.getPlaneId(), created.getPlaneId());
        System.out.println("Create: " + created);
    }

    @Test
    void b_read() {
        Airline read = repository.read(airline.getPlaneId());
        assertNotNull(read);
        System.out.println("Read " + read);
    }

    @Test
    void c_update() {
        Airline update = new Airline.Builder().copy(airline)
                .setAirlineCode(9874)
                .setAirlineName("Mango")
                .setNumberFlights(10)
                .setNumberPlane(12)
                .build();
        assertNotNull(repository.update(update));
        System.out.println("Updated: " + update);
    }

    @Test
    void e_delete() {
        boolean success = repository.delete(airline.getPlaneId());
        assertTrue(success);
        System.out.println("Deleted: " + success);
    }

    @Test
    void d_getAll() {
        System.out.println("Show all:");
        System.out.println(repository.getAll());
    }
}