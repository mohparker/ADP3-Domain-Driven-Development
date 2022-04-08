/* UserFactory.java
 Factory for the UserFactory
 Author: Daniel Marais (219476845)
 Date: 30 March 2022
*

 */
package za.ac.cput.Factory;

import za.ac.cput.Entity.Flight;
import za.ac.cput.Entity.User;
import za.ac.cput.Util.Helper;

public class UserFactory {

    public static User createUser(String firstName, String lastName, String email, int ticketsBought, int bookedSeats){
        if(!Helper.isValidEmail(email)){
            System.out.println("Not a valid email");
            return null;}
        if (Helper.isNullorEmpty(firstName)||Helper.isNullorEmpty(lastName)) //firstName.isEmpty()
            return null;
        String userId= Helper.generatedId();
        String ticketId= Helper.generatedId();
        return new User.Builder().setUserId(userId)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setTicketId(ticketId)
                .setTicketsBought(ticketsBought)
                .setBookedSeats(bookedSeats)
                .builder();
    }
}
