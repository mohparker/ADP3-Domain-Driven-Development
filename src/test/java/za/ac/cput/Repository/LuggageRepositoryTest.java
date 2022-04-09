package za.ac.cput.Repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.Entity.Luggage;
import za.ac.cput.Factory.LuggageFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class LuggageRepositoryTest {
    private static LuggageRepository repository = LuggageRepository.getRepository();
    private static Luggage luggage= LuggageFactory.createLuggage("Jeane-Leigh",2,6,20);
    @Test
    void a_create(){
        Luggage created=repository.create(luggage);
        assertEquals(luggage.getLuggageId(),created.getLuggageId());
        System.out.println("Create: "+ created);
    }
    @Test
    void b_read(){
        Luggage read = repository.read(luggage.getLuggageId());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }
    @Test
    void c_update(){
        Luggage updated = new Luggage.Builder().copy(luggage)
                .setNumberBags(3)
                .setHandLuggageWeight(7)
                .setCargoStorageWeight(23)
                .build();
        assertNotNull(repository.update(updated));
        System.out.println("Updated: " +updated);
    }
    @Test
    void e_delete(){
        boolean success = repository.delete(luggage.getLuggageId());
        assertTrue(success);
        System.out.println("Deleted: "+ success);
    }
    @Test
    void d_getAll(){
        System.out.println("Show all: ");
        System.out.println(repository.getAll());
    }
}