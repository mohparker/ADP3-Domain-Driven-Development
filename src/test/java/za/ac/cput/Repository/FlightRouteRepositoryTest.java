package za.ac.cput.Repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.Entity.FlightRoute;
import za.ac.cput.Factory.FlightRouteFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class FlightRouteRepositoryTest {
    private static FlightRouteRepository repository = FlightRouteRepository.getRepository();
    private static FlightRoute flightRoute = FlightRouteFactory.createFlightRoute("Cape Town International", "Johannesburg International");



    @Test
    void a_create() {
        FlightRoute created = repository.create(flightRoute);
        assertEquals(flightRoute.getRouteId(), created.getRouteId());
        System.out.println("Create: " + created);
    }

    @Test
    void b_read() {
        FlightRoute read = repository.read(flightRoute.getRouteId());
        assertNotNull(read);
        System.out.println("Read: "+ read);
    }

    @Test
    void c_update() {
        FlightRoute update = new FlightRoute.Builder().copy(flightRoute)
                .setFlightArrivalAirport("Durban International")
                .setFlightDepartureAirport("Cape Town International")
                .build();
        assertNotNull(repository.update(update));
        System.out.println("Updated: " + update);

    }

    @Test
    void d_getAll() {
        System.out.println("Show all:" );
        System.out.println(repository.getAll());

    }

    @Test
    void e_delete() {
        boolean success = repository.delete(flightRoute.getRouteId());
        assertTrue(success);
        System.out.println("Deleted: " + success );
    }


}
