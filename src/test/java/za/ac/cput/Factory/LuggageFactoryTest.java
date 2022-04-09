package za.ac.cput.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.Luggage;

import java.sql.SQLOutput;

import static org.junit.jupiter.api.Assertions.*;

public class LuggageFactoryTest {
    @Test
    public void test(){
        Luggage luggage = LuggageFactory.createLuggage("Jeane-Leigh",2,6,15);
        System.out.println(luggage.toString());
        assertNotNull(luggage);
    }

}