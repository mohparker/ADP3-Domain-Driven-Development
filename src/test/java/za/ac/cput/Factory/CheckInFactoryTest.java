/*CheckInFactoryTest.java
Test for the CheckInFactoryTest
Author: Zaakirah Fakier (220461503)
Date: 07 April 2022
 */

package za.ac.cput.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.CheckIn;

import static org.junit.jupiter.api.Assertions.*;

class CheckInFactoryTest {
    @Test
    public void test(){
        CheckIn checkIn = CheckInFactory.createCheckIn(true,12,1546);
        assertNotNull(checkIn);
        System.out.println(checkIn.toString());

    }
}