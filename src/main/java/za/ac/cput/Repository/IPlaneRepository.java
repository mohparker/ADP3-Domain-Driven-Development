/* IPlaneRepository.java
   interface for the PlaneRepository
   Author: Juan-Lee Zidane Klink (218236883)
   Date: 7 April 2022
 */
package za.ac.cput.Repository;

import za.ac.cput.Entity.Plane;

import java.util.Set;

public interface IPlaneRepository extends IRepository<Plane, String>{

    public Set<Plane> getAll();
}
