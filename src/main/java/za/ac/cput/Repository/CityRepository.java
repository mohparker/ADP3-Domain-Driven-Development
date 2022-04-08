/* CityRepository.java
 * Repository for City
 * Author: Mary-Beth Agulhas
 * Date: 5 April 2022
 */
package za.ac.cput.Repository;


import za.ac.cput.Entity.City;

import java.util.HashSet;
import java.util.Set;

public class CityRepository implements ICityRepository{
    private static CityRepository repository =null;
    private Set<City> cityDB=null;

    private CityRepository()
    { cityDB=new HashSet<City>();  }
    public static CityRepository getRepository(){
        if(repository == null){
            repository = new CityRepository();
        }
        return repository;
    }



    @Override
    public City create(City city) {
        boolean success = cityDB.add(city);
        if(!success)
            return null;
        return city;
    }


    @Override
    public City read(String cityId) {
        City city = cityDB.stream()
                .filter(c -> c.getCityId().equals(cityId))
                .findAny()
                .orElse(null);
        return city;

    }

    @Override
    public City update(City city) {
        City previousCity=read(city.getCityId());
        if(previousCity != null)
        {
            cityDB.remove(previousCity);
            cityDB.add(city);
            return city;
        }
        return null;

    }

    @Override
    public boolean delete(String cityId) {
        City cityToDelete = read(cityId);
        if(cityToDelete == null)
            return false;
        cityDB.remove(cityToDelete);
        return true;
    }
    @Override
    public Set<City> getAll() {
        return cityDB;
    }
}

