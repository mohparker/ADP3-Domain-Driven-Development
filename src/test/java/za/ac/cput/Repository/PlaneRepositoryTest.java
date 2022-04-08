/* PlaneRepositoryTest.java
   Tests for the PlaneRepository
   Author: Juan-Lee Zidane Klink (218236883)
   Date: 7 April 2022
 */
package za.ac.cput.Repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.Entity.Plane;
import za.ac.cput.Factory.PlaneFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)

class PlaneRepositoryTest {
    private static PlaneRepository repository = PlaneRepository.getRepository();
    private static Plane plane = PlaneFactory.createPlane("blue","24579","July 2022");

    @Test
    void a_create() {
        Plane createdPlane = repository.create(plane);
        assertEquals(plane.getPlaneId(), createdPlane.getPlaneId());
        System.out.println("Created Plane: " + createdPlane);
    }

    @Test
    void b_read() {
        Plane planeToBeViewed = repository.read(plane.getPlaneId());
        assertNotNull(planeToBeViewed);
        System.out.println("View Plane: " + planeToBeViewed);
    }

    @Test
    void c_update() {
        Plane updatedPlane = new Plane.Builder().copy(plane).setColor("white").setModelNumber("111111").setModelDate("March 2020").build();
        assertNotNull(repository.update(updatedPlane));
        System.out.println("Updated Plane: " + updatedPlane);
    }

    @Test
    void e_delete() {
        boolean success = repository.delete(plane.getPlaneId());
        assertTrue(success);
        System.out.println("Successfully deleted plane");
    }

    @Test
    void d_getAll() {
        System.out.println("Show all planes:");
        System.out.println(repository.getAll());
    }
}