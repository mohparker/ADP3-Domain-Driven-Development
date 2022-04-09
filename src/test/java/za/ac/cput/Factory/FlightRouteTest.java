package za.ac.cput.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.FlightRoute;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class FlightRouteTest {
@Test
    public void test() {
        FlightRoute flightRoute = FlightRouteFactory.createFlightRoute("Cape Town International Airport",
        "OR Tambo(JHB)");
        System.out.println(flightRoute.toString());
        assertNotNull(flightRoute);
    }
}
