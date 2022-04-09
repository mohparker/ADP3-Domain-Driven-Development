package za.ac.cput.Repository;

import za.ac.cput.Entity.Airport;


import java.util.Set;

public interface IAirportRepository extends IRepository<Airport, String>{
    Airport read(String airportId);

    public Set<Airport> getAll();
}
