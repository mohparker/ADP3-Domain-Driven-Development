/* AirportFactoryTest.java
 * Test class for AirportFactory
 * Author: Mary-Beth Agulhas
 * Date: 31 March 2022
 */
package za.ac.cput.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.Airport;

import static org.junit.jupiter.api.Assertions.*;

class AirportFactoryTest {

    @Test
    void createAirport() {
        Airport airport=AirportFactory.createAirport("zxcv", "Cape Town International");
        System.out.println(airport.toString());
        assertNotNull(airport);
    }
}