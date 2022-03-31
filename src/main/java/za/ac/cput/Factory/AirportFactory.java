/* AirportFactory.java
 * Factory class for Airport
 * Author: Mary-Beth Agulhas
 * Date: 31 March 2022
 */
package za.ac.cput.Factory;

import za.ac.cput.Entity.Airport;
import za.ac.cput.Util.Helper;

public class AirportFactory {
    public static Airport createAirport(String flightCode, String airportName ){
        String airportNumber= Helper.generateId();
        String cityNumber=Helper.generateId();
        Airport airport=new Airport.Builder().setAirportId(airportNumber).setCityId(cityNumber)
                .setFlightCode(flightCode)
                .setAirportName(airportName)
                .build();
        return airport;
    }
}
