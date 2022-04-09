/* CityFactory.java
 * Factory class for City
 * Author: Mary-Beth Agulhas
 * Date: 31 March 2022
 */
package za.ac.cput.Factory;

import za.ac.cput.Entity.City;
import za.ac.cput.Util.Helper;

public class CityFactory {
    public static City createCity(String cityName, String country ){
        String cityNumber= Helper.generatedId();
        City city=new City.Builder().setCityId(cityNumber)
                .setCityName(cityName)
                .setCountry(country)
                .build();
        return city;
    }
}
