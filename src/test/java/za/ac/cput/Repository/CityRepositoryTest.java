/* CityRepositoryTest.java
 * Test for CityRepository
 * Author: Mary-Beth Agulhas
 * Date: 5 April 2022
 */
package za.ac.cput.Repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.Entity.City;
import za.ac.cput.Factory.CityFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class CityRepositoryTest {
    private static CityRepository repository= CityRepository.getRepository();
    private static City city = CityFactory
            .createCity("Cape Town","South Africa");

    @Test
    void a_create() {
        City created = repository.create(city);
        assertEquals(city.getCityId(), created.getCityId());
        System.out.println("Created: " + created);
    }

    @Test
    void b_read() {
        City read = repository.read(city.getCityId());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void c_update() {
        City updated = new City.Builder().copy(city)
                .setCityName("Johannesburg")
                .setCountry("South Africa")
                .build();
        assertNotNull(repository.update(updated));
        System.out.println("Updated: "+ updated);
    }

    @Test
    void e_delete() {
        boolean success = repository.delete(city.getCityId());
        assertTrue(success);
        System.out.println("Deleted: " + success);
    }

    @Test
    void d_getAll() {
        System.out.println("Show all");
        System.out.println(repository.getAll());
    }
}