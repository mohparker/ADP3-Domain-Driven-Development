/* Helper.java
 Util for the Helper
 Author: Daniel Marais (219476845)
 Date: 30 March 2022
*

 */
package za.ac.cput.Util;

import org.apache.commons.validator.routines.EmailValidator;

import java.util.UUID;

public class Helper {
    public static String generatedId() {

        return UUID.randomUUID().toString();}
    public static boolean isNullorEmpty(String s) {
        return (s == null || s.equals("") || s.isEmpty() || s.equalsIgnoreCase("null"));
    }
    public static boolean isValidEmail(String email){
        EmailValidator ev= EmailValidator.getInstance();
        return ev.isValid(email);
    }

    //to test if null or empty

}
