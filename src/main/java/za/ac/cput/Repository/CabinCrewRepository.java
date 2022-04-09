/* CabinCrewRepository.java
   Repository for the CabinCrew
   Author: Juan-Lee Zidane Klink (218236883)
   Date: 7 April 2022
 */
package za.ac.cput.Repository;

import za.ac.cput.Entity.CabinCrew;


import java.util.HashSet;
import java.util.Set;

public class CabinCrewRepository implements ICabinCrewRepository{
    private static CabinCrewRepository repository = null;
    private Set<CabinCrew> cabinCrewDS = null;

    private CabinCrewRepository(){
        cabinCrewDS = new HashSet<CabinCrew>();
    }

    public static CabinCrewRepository getRepository(){
        if (repository == null){
            repository = new CabinCrewRepository();
        }
        return repository;
    }



    @Override
    public CabinCrew create(CabinCrew cabinCrew) {
        boolean success = cabinCrewDS.add(cabinCrew);
        if(!success)
            return null;
        return cabinCrew;
    }

    @Override
    public CabinCrew read(String flightId) {
        for(CabinCrew c : cabinCrewDS) {
            if (c.getFlightId().equals(flightId))
                return c;
        }
        return null;
    }

    @Override
    public CabinCrew update(CabinCrew cabinCrew) {
        CabinCrew oldCrew = read(cabinCrew.getFlightId());
        if(oldCrew != null){
            cabinCrewDS.remove(oldCrew);
            cabinCrewDS.add(cabinCrew);
            return cabinCrew;
        }
        return null;
    }

    @Override
    public boolean delete(String flightId) {
        CabinCrew crewToDelete = read(flightId);
        if(crewToDelete == null)
            return false;
        cabinCrewDS.remove(crewToDelete);
        return true;
    }

    @Override
    public Set<CabinCrew> getAll() {
        return cabinCrewDS;
    }
}
