/* CabinCrewFactoryTest.java
   Test class for the CabinCrewFactory
   Author: Juan-Lee Zidane Klink (218236883)
   Date: 31 March 2022
 */
package za.ac.cput.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.CabinCrew;


import static org.junit.jupiter.api.Assertions.*;

class CabinCrewFactoryTest {

    @Test
    public void testCrewCreate(){
        CabinCrew crew = CabinCrewFactory.createCabinCrew("John","Smith","Mango","FLight Attendant");
        System.out.println(crew.toString());
        assertNotNull(crew);
    }

}