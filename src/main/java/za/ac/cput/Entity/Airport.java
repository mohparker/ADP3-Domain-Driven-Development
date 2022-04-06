/* Airport.java
 * Entity for Airport
 * Author: Mary-Beth Agulhas
 * Date: 31 March 2022
 */
package za.ac.cput.Entity;

public class Airport {
    private String airportId;
    private String cityId;
    private String flightCode;
    private String airportName;

    private Airport(){}

    private Airport(Builder builder){
        this.airportId=builder.airportId;
        this.cityId=builder.cityId;
        this.flightCode=builder.flightCode;
        this.airportName=builder.airportName;
    }

    public String getAirportId() {
        return airportId;
    }

    public void setAirportId(String airportId) {
        this.airportId = airportId;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getFlightCode() {
        return flightCode;
    }

    public void setFlightCode(String flightCode) {
        this.flightCode = flightCode;
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "airportId='" + airportId + '\'' +
                ", cityId='" + cityId + '\'' +
                ", flightCode='" + flightCode + '\'' +
                ", airportName='" + airportName + '\'' +
                '}';
    }
    public static class Builder{
        private String airportId;
        private String cityId;
        private String flightCode;
        private String airportName;

        public Builder setAirportId(String airportId){
            this.airportId=airportId;
            return this;
        }
        public Builder setCityId(String cityId){
            this.cityId=cityId;
            return this;
        }
        public Builder setFlightCode(String flightCode){
            this.flightCode=flightCode;
            return this;
        }
        public Builder setAirportName(String airportName){
            this.airportName=airportName;
            return this;
        }
        public Builder copy(Airport airport){
            this.airportId=airportId;
            this.cityId=cityId;
            this.flightCode=flightCode;
            this.airportName=airportName;
            return this;
        }
        public Airport build(){
            return new Airport(this);
        }
    }
}
