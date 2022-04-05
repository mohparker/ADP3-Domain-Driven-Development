package za.ac.cput.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.User;

import static org.junit.jupiter.api.Assertions.*;

class UserFactoryTest {
        @Test
        public void test(){
            User user= UserFactory.createUser("Daniel","Marais","219476845@mycput.ac.za",2,1);
            System.out.println(user.toString());
            assertNotNull(user);
        }

}