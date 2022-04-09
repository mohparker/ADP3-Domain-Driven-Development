/* AirportRepository.java
 * Repository for Airport
 * Author: Mary-Beth Agulhas
 * Date: 5 April 2022
 */
package za.ac.cput.Repository;

import za.ac.cput.Entity.Airport;


import java.util.HashSet;
import java.util.Set;

public class AirportRepository implements IAirportRepository{
    private static AirportRepository repository=null;
    private Set<Airport> airportDB=null;

    private AirportRepository(){ airportDB=new HashSet<Airport>();  }
    public static AirportRepository getRepository(){
        if(repository == null){
            repository = new AirportRepository();
        }
        return repository;
    }

    @Override
    public Airport create(Airport airport) {
        boolean success = airportDB.add(airport);
        if(!success)
            return null;
        return airport;
    }

    @Override
    public Airport read(String airportId) {
        Airport airport = airportDB.stream()
                .filter(a -> a.getAirportId().equals(airportId))
                .findAny()
                .orElse(null);
        return airport;

    }

    @Override
    public Airport update(Airport airport) {
        Airport previousAirport=read(airport.getAirportId());
        if(previousAirport != null){
            airportDB.remove(previousAirport);
            airportDB.add(airport);
            return airport;
        }
        return null;

    }

    @Override
    public boolean delete(String airportId) {
        Airport airportToDelete = read(airportId);
        if(airportToDelete == null)
            return false;
        airportDB.remove(airportToDelete);
        return true;
    }
    @Override
    public Set<Airport> getAll() {
        return airportDB;
    }
}

