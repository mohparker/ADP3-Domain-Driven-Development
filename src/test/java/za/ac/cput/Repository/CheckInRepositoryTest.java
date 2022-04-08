/*CheckInRepositoryTest.java
Repository for the CheckInRepositoryTest
Author: Zaakirah Fakier (220461503)
Date: 08 April 2022
 */
package za.ac.cput.Repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.Entity.CheckIn;
import za.ac.cput.Factory.CheckInFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class CheckInRepositoryTest {


    private static CheckInRepository repository = CheckInRepository.getRepository();
    private static CheckIn checkIn = CheckInFactory.createCheckIn(true,12,646);


    @Test
    void a_create() {
        CheckIn created = repository.create(checkIn);
        assertEquals(checkIn.getUserId(), created.getUserId());
        System.out.println("Create: " + created);

    }

    @Test
    void b_read() {
        CheckIn read = repository.read(checkIn.getUserId());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void c_update() {
        CheckIn updated = new CheckIn.Builder().copy(checkIn).setPriorityBoard(true)
                .setSeatReservation(32)
                .setOverWeightFee(344)
                .build();
        assertNotNull(repository.update(updated));
        System.out.println("Updated: " + updated);
    }

    @Test
    void d_delete() {
        boolean success = repository.delete(checkIn.getUserId());
        assertTrue(success);
        System.out.println("Deleted: " + success);
    }

    @Test
    void e_getAll() {
        System.out.println("Show all: ");
        System.out.println(repository.getAll());

    }
}