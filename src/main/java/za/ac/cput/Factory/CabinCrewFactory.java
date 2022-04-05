/* CabinCrewFactory.java
   factory for the CabinCrew
   Author: Juan-Lee Zidane Klink (218236883)
   Date: 31 March 2022
 */
package za.ac.cput.Factory;

import za.ac.cput.Entity.CabinCrew;
import za.ac.cput.Util.Helper;

public class CabinCrewFactory {

    // this class is to create Cabin Crew objects
    public static CabinCrew createCabinCrew(String firstName, String lastName, String pilotAirlineName, String cabinCrewRole){
        String flightId = Helper.generatedId();
        if(Helper.isNullorEmpty(flightId) || Helper.isNullorEmpty(firstName) || Helper.isNullorEmpty(lastName) || Helper.isNullorEmpty(pilotAirlineName) || Helper.isNullorEmpty(cabinCrewRole))
            return null;


        return new CabinCrew.Builder().setFlightId(flightId)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setPilotAirlineName(pilotAirlineName)
                .setCabinCrewRole(cabinCrewRole)
                .build();
    }

}
