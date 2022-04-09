/* PlaneRepository.java
   Repository for the Plane
   Author: Juan-Lee Zidane Klink (218236883)
   Date: 7 April 2022
 */
package za.ac.cput.Repository;

import za.ac.cput.Entity.Plane;

import java.util.HashSet;
import java.util.Set;

public class PlaneRepository implements IPlaneRepository{
    private static PlaneRepository repository = null;
    private Set<Plane> planeDS = null;

    private PlaneRepository(){
        planeDS = new HashSet<Plane>();
    }

    public static PlaneRepository getRepository(){
        if (repository == null){
            repository = new PlaneRepository();
        }
        return repository;
    }


    @Override
    public Plane create(Plane plane) {
        boolean success = planeDS.add(plane);
        if(!success)
            return null;
        return plane;
    }

    @Override
    public Plane read(String planeId) {
        for(Plane p : planeDS) {
            if (p.getPlaneId().equals(planeId))
                return p;
        }
        return null;
    }

    @Override
    public Plane update(Plane plane) {
        Plane oldPlane = read(plane.getPlaneId());
        if(oldPlane != null){
            planeDS.remove(oldPlane);
            planeDS.add(plane);
            return plane;
        }
        return null;
    }

    @Override
    public boolean delete(String planeId) {
        Plane planeToDelete = read(planeId);
        if(planeToDelete == null)
            return false;
        planeDS.remove(planeToDelete);
        return true;
    }

    @Override
    public Set<Plane> getAll() {
        return planeDS;
    }
}
