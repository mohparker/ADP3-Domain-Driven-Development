/* CabinCrew.java
   Entity for the Cabin Crew
   Author: Juan-Lee Zidane Klink (218236883)
   Date: 30 March 2022
 */
package za.ac.cput.Entity;

public class CabinCrew {
    private String flightId;
    private String firstName;
    private String lastName;
    private String pilotAirlineName;
    private String cabinCrewRole;

    //Constructor
    private CabinCrew(Builder builder){
        this.flightId = builder.flightId;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.pilotAirlineName = builder.pilotAirlineName;
        this.cabinCrewRole = builder.cabinCrewRole;
    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPilotAirlineName() {
        return pilotAirlineName;
    }

    public void setPilotAirlineName(String pilotAirlineName) {
        this.pilotAirlineName = pilotAirlineName;
    }

    public String getCabinCrewRole() {
        return cabinCrewRole;
    }

    public void setCabinCrewRole(String cabinCrewRole) {
        this.cabinCrewRole = cabinCrewRole;
    }

    @Override
    public String toString() {
        return "CabinCrew{" +
                "flightId='" + flightId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pilotAirlineName='" + pilotAirlineName + '\'' +
                ", cabinCrewRole='" + cabinCrewRole + '\'' +
                '}';
    }

    public static class Builder {
        private String flightId;
        private String firstName;
        private String lastName;
        private String pilotAirlineName;
        private String cabinCrewRole;

        public Builder setFlightId(String flightId) {
            this.flightId = flightId;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setPilotAirlineName(String pilotAirlineName) {
            this.pilotAirlineName = pilotAirlineName;
            return this;
        }

        public Builder setCabinCrewRole(String cabinCrewRole) {
            this.cabinCrewRole = cabinCrewRole;
            return this;
        }

        public Builder copy(CabinCrew crew){
            this.flightId = crew.flightId;
            this.firstName = crew.firstName;
            this.lastName = crew.lastName;
            this.pilotAirlineName = crew.pilotAirlineName;
            this.cabinCrewRole = crew.cabinCrewRole;
            return this;
        }

        public CabinCrew build(){
            return new CabinCrew(this);
        }
    }
}

