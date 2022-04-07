/*CheckInFactory.java
Factory for the CheckInFactory
Author: Zaakirah Fakier (220461503)
Date: 07 April 2022
 */
package za.ac.cput.Factory;

import za.ac.cput.Entity.CheckIn;

import za.ac.cput.Util.Helper;

public class CheckInFactory {
    public static CheckIn createCheckIn(boolean priorityBoard, int seatReservation, int overWeightFee){
        String userId = Helper.generatedId();
        String flightId = Helper.generatedId();
        CheckIn checkIn = new CheckIn.Builder().setUserId(userId)
                .setFlightId(flightId)
                .setPriorityBoard(priorityBoard)
                .setSeatReservation(seatReservation)
                .setOverWeightFee(overWeightFee)
                .build();
        return checkIn;

    }
}
