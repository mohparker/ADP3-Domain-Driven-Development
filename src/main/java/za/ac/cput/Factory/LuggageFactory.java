/*LuggageFactory.Java
Factory for Luggage Entity
Author: Erin Rowan (215271157)
 */
package za.ac.cput.Factory;

import za.ac.cput.Entity.Luggage;
import za.ac.cput.Util.Helper;


public class LuggageFactory {
    public static Luggage createLuggage(String luggageOwner, int numberBags, int handLuggageWeight, int cargoStorageWeight){
        String luggageId = Helper.generatedId();
        Luggage luggage = new Luggage.Builder().setLuggageId(luggageId)
                .setLuggageOwner(luggageOwner)
                .setNumberBags(numberBags)
                .setHandLuggageWeight(handLuggageWeight)
                .setCargoStorageWeight(cargoStorageWeight)
                .build();
            return luggage;
        }
}
