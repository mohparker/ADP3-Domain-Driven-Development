/* PlaneFactory.java
   Factory for the Plane
   Author: Juan-Lee Zidane Klink (218236883)
   Date: 31 March 2022
 */
package za.ac.cput.Factory;

import za.ac.cput.Entity.Plane;
import za.ac.cput.Util.Helper;

public class PlaneFactory {

    // this class is to create Plane objects

    public static Plane createPlane(String color, String modelNumber, String modelDate){
        String planeId = Helper.generatedId();
        String flightId = Helper.generatedId();

        if(Helper.isNullorEmpty(planeId) || Helper.isNullorEmpty(flightId) || Helper.isNullorEmpty(color) || Helper.isNullorEmpty(modelNumber) || Helper.isNullorEmpty(modelDate))
            return null;

        return new Plane.Builder().setPlaneId(planeId)
                .setFlightId(flightId)
                .setColor(color)
                .setModelNumber(modelNumber)
                .setModelDate(modelDate)
                .build();


    }
}
