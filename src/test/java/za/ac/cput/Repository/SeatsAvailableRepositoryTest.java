package za.ac.cput.Repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.Entity.SeatsAvailable;
import za.ac.cput.Factory.SeatsAvailableFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class SeatsAvailableRepositoryTest {
    private static SeatsAvailableRepository repository = SeatsAvailableRepository.getRepository();
    private static SeatsAvailable seatsAvailable= SeatsAvailableFactory.createSeatsAvailable(1,"F1",1);
    @Test
    void a_create(){
        SeatsAvailable created=repository.create(seatsAvailable);
        assertEquals(seatsAvailable.getSeatId(),created.getSeatId());
        System.out.println("Create: "+ created);
    }
    @Test
    void b_read(){
        SeatsAvailable read = repository.read(seatsAvailable.getSeatId());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }
    @Test
    void c_update(){
        SeatsAvailable updated = new SeatsAvailable.Builder().copy(seatsAvailable)
                .setBookedSeat("F2")
                .setReservedSeat(1)
                .setNumberSeat(1)
                .build();
        assertNotNull(repository.update(updated));
        System.out.println("Updated: " +updated);
    }
    @Test
    void e_delete(){
        boolean success = repository.delete(seatsAvailable.getSeatId());
        assertTrue(success);
        System.out.println("Deleted: "+ success);
    }
    @Test
    void d_getAll(){
        System.out.println("Show all: ");
        System.out.println(repository.getAll());
    }
}