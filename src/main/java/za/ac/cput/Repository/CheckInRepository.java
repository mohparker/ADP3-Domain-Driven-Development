/*CheckInRepository.java
Repository for the CheckInRepository
Author: Zaakirah Fakier (220461503)
Date: 08 April 2022
 */
package za.ac.cput.Repository;

import za.ac.cput.Entity.CheckIn;

import java.util.HashSet;
import java.util.Set;

public class CheckInRepository implements ICheckInRepository {
    private static CheckInRepository repository = null;
    private Set<CheckIn> checkInDB = null;

    private CheckInRepository(){
        checkInDB = new HashSet<CheckIn>();
    }

    public static CheckInRepository getRepository() {
        if (repository == null){
            repository = new CheckInRepository();
        }
        return repository;
    }

    @Override
    public CheckIn create(CheckIn checkIn) {
        boolean success = checkInDB.add(checkIn);
        if(!success)

            return null;
        return checkIn;

    }

    @Override
    public CheckIn read(String userId) {
       /* for (CheckIn c: checkInDB) {
            if (c.getUserId().equals(userId))
                return c;
        }
        return null;*/
        CheckIn checkIn = checkInDB.stream()
                .filter(c -> c.getUserId().equals(userId))
                .findAny()
                .orElse(null);
        return checkIn;


    }

    @Override
    public CheckIn update(CheckIn checkIn) {
        CheckIn oldCheckIn = read(checkIn.getUserId());
        if(oldCheckIn !=null){
            checkInDB.remove(oldCheckIn);
            checkInDB.add(checkIn);
            return checkIn;

        }
        return null;


    }

    @Override
    public boolean delete(String userId) {
        CheckIn checkInToDelete = read(userId);
        if (checkInToDelete == null)
            return false;
        checkInDB.remove(checkInToDelete);
        return true;
    }

    @Override
    public Set<CheckIn> getAll() {
        return null;
    }
}
