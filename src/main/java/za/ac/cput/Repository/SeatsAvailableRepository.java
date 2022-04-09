package za.ac.cput.Repository;

import za.ac.cput.Entity.Luggage;
import za.ac.cput.Entity.SeatsAvailable;

import java.util.HashSet;
import java.util.Set;

public class SeatsAvailableRepository implements ISeatsAvailableRepository {
   private static za.ac.cput.Repository.SeatsAvailableRepository repository=null;
   private Set<SeatsAvailable> seatsAvailableDB=null;

   private SeatsAvailableRepository(){
       seatsAvailableDB= new HashSet<SeatsAvailable>();
   }

   public static SeatsAvailableRepository getRepository(){
       if(repository==null){
           repository=new SeatsAvailableRepository();
       }
       return repository;
   }
        @Override
        public SeatsAvailable create(SeatsAvailable seatsAvailable){
       boolean success = seatsAvailableDB.add(seatsAvailable);
       if(!success)
           return null;
       return seatsAvailable;
        }

        @Override
        public SeatsAvailable read(String seatId){
            SeatsAvailable seatsAvailable = seatsAvailableDB.stream().filter(e->e.getSeatId().equals(seatId))
                    .findAny()
                    .orElse(null);
            return seatsAvailable;
        }


    @Override
    public SeatsAvailable update (SeatsAvailable seatsAvailable){
        SeatsAvailable oldSeatsAvailable = read(seatsAvailable.getSeatId());
        if(oldSeatsAvailable !=null){
            seatsAvailableDB.remove(oldSeatsAvailable);
            seatsAvailableDB.add(seatsAvailable);
            return seatsAvailable;
        }
        return null;
    }

        @Override
        public boolean delete(String seatId){
       SeatsAvailable seatsAvailableToDelete = read(seatId);
       if (seatsAvailableToDelete==null)
           return false;
       seatsAvailableDB.remove(seatsAvailableToDelete);
       return true;
        }

        @Override
    public Set<SeatsAvailable>getAll(){
            return null;
        }

}
