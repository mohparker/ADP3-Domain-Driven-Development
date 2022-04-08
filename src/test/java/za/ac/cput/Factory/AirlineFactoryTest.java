package za.ac.cput.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.Airline;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AirlineFactoryTest {
    @Test
    public void test()
    {
        Airline airline = AirlineFactory.createAirline(5986, 50,8,"Mango"  );
        System.out.println(airline.toString());
        assertNotNull(airline);

    }
}
