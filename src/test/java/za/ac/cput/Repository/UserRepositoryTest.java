package za.ac.cput.Repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.Entity.User;
import za.ac.cput.Factory.UserFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class UserRepositoryTest {
    private static UserRepository repository = UserRepository.getRepository();
    private static User user= UserFactory.createUser("Daniel","Marais","219476845@mycput.ac.za",2,1);
    @Test
    void a_create(){
        User created= repository.create((user));
        assertEquals(user.getUserId(),created.getUserId());
        System.out.println("Create: "+ created);
    }
    @Test
    void b_read(){
        User read= repository.read(user.getUserId());
        assertNotNull(read);
        System.out.println("Read: "+ read);
    }
    @Test
    void c_update(){
        User updated= new User.Builder().copy(user)
                .setFirstName("Curlsy")
                .setLastName("Pengu")
                .setEmail("dpengmarais99@gmail.com")
                .setTicketsBought(5)
                .setBookedSeats(2)
                .builder();
        assertNotNull(repository.update(updated));
        System.out.println("Updated: "+ updated);
    }
    @Test
    void e_delete(){
        boolean success= repository.delete(user.getUserId());
        assertTrue(success);
        System.out.println("Delete: "+ success);

    }
    @Test
    void d_getAll(){
        System.out.println("Show all:");
        System.out.println(repository.getAll());
    }
}