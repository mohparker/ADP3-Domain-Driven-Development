package za.ac.cput.Repository;

import za.ac.cput.Entity.City;

import java.util.Set;

public interface ICityRepository extends IRepository<City, String>{


    City read(String cityId);

    public Set<City> getAll();
}
