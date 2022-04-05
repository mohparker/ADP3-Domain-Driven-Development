/* PlaneFactoryTest.java
   Test class for the PlaneFactory
   Author: Juan-Lee Zidane Klink (218236883)
   Date: 31 March 2022
 */
package za.ac.cput.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.Plane;

import static org.junit.jupiter.api.Assertions.*;

class PlaneFactoryTest {

    @Test
    public void testPlaneCreate(){
        Plane plane = PlaneFactory.createPlane("blue", "1234567", "July 2020");
        System.out.println(plane.toString());
        assertNotNull(plane);
    }

}