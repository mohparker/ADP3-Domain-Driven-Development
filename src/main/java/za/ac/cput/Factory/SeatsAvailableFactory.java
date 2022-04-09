/*SeatsAvailableFactory.Java
Factory for the SeatsAvailable Entity
Author: Erin Rowan (215271157)
 */
package za.ac.cput.Factory;

import za.ac.cput.Entity.SeatsAvailable;
import za.ac.cput.Util.Helper;

public class SeatsAvailableFactory {
    public static SeatsAvailable createSeatsAvailable(int numberSeat, String bookedSeat, int reservedSeat){
        String seatId = Helper.generatedId();
        SeatsAvailable seatsAvailable = new SeatsAvailable.Builder()
                .setSeatId(seatId)
                .setNumberSeat(numberSeat)
                .setBookedSeat(bookedSeat)
                .setReservedSeat(reservedSeat)
                .build();
        return seatsAvailable;
    }
}
