/*LuggageRepository.java
Repository for Luggage Factory
Author: Erin Rowan(215271157)
*/
package za.ac.cput.Repository;


import za.ac.cput.Entity.Luggage;

import java.util.HashSet;
import java.util.Set;

public class LuggageRepository implements ILuggageRepository {
    private static LuggageRepository repository=null;
    private Set<Luggage> luggageDB=null;

    private LuggageRepository(){
        luggageDB= new HashSet<Luggage>();
    }

    public static LuggageRepository getRepository(){
        if(repository==null){
            repository = new LuggageRepository();
        }
        return repository;
    }

    @Override
    public Luggage create (Luggage luggage){
        boolean success = luggageDB.add(luggage);
        if(!success)
            return null;
        return luggage;
    }
    @Override
    public Luggage read(String luggageID){
        Luggage luggage = luggageDB.stream().filter(e->e.getLuggageId().equals(luggageID))
                .findAny()
                .orElse(null);
        return luggage;
    }

    @Override
    public Luggage update (Luggage luggage){
        Luggage oldLuggage = read(luggage.getLuggageId());
        if(oldLuggage !=null){
            luggageDB.remove(oldLuggage);
            luggageDB.add(luggage);
        return luggage;}
        return null;
    }
    @Override
    public boolean delete(String luggageId){
        Luggage luggageToDelete = read(luggageId);
        if(luggageToDelete== null)
            return false;
        luggageDB.remove(luggageToDelete);
        return true;
    }

    @Override
    public Set<Luggage> getAll(){
        return luggageDB;
    }
}
