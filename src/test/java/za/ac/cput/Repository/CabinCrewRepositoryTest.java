/* CabinCrewRepositoryTest.java
   Tests for the CabinCrewRepository
   Author: Juan-Lee Zidane Klink (218236883)
   Date: 7 April 2022
 */
package za.ac.cput.Repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.Entity.CabinCrew;
import za.ac.cput.Factory.CabinCrewFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)

class CabinCrewRepositoryTest {
    private static CabinCrewRepository repository = CabinCrewRepository.getRepository();
    private static CabinCrew crewman = CabinCrewFactory.createCabinCrew("Matthew", "Pickman", "Mango", "flight Attendant");

    @Test
    void a_create() {
        CabinCrew createdCrew = repository.create(crewman);
        assertEquals(crewman.getFlightId(), createdCrew.getFlightId());
        System.out.println("Created Crewman: " + createdCrew);
    }

    @Test
    void b_read() {
        CabinCrew crewmanToBeViewed = repository.read(crewman.getFlightId());
        assertNotNull(crewmanToBeViewed);
        System.out.println("View crewman: " + crewmanToBeViewed);
    }

    @Test
    void c_update() {
        CabinCrew updatedCrewman = new CabinCrew.Builder().copy(crewman).setFirstName("Benjamin").setLastName("Black").setPilotAirlineName("Fly Emirates").setCabinCrewRole("Cleanup crew").build();
        assertNotNull(repository.update(updatedCrewman));
        System.out.println("Updated crewman: " + updatedCrewman);
    }

    @Test
    void e_delete() {
        boolean success = repository.delete(crewman.getFlightId());
        assertTrue(success);
        System.out.println("Successfully deleted crewman");
    }

    @Test
    void d_getAll() {
        System.out.println("Show cabin crew:");
        System.out.println(repository.getAll());
    }
}