/* CityFactory.java
 * Test class for CityFactory
 * Author: Mary-Beth Agulhas
 * Date: 31 March 2022
 */
package za.ac.cput.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.City;

import static org.junit.jupiter.api.Assertions.*;

class CityFactoryTest {

    @Test
    void createCity() {
        City city=CityFactory.createCity("Cape Town","South Africa");
        System.out.println(city.toString());
        assertNotNull(city);
    }
}