package za.ac.cput;

public class Flight {
    private String flightId;
    private String dateOfFLight;
    private String timeOfFlight;
    private int numberOfPassengers;

    private Flight(Builder builder){
        this.flightId= builder.flightId;
        this.dateOfFLight= builder.dateOfFlight;
        this.timeOfFlight= builder.timeOfFlight;
        this.numberOfPassengers=builder.numberOfPassengers;
    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public String getDateOfFLight() {
        return dateOfFLight;
    }

    public void setDateOfFLight(String dateOfFLight) {
        this.dateOfFLight = dateOfFLight;
    }

    public String getTimeOfFlight() {
        return timeOfFlight;
    }

    public void setTimeOfFlight(String timeOfFlight) {
        this.timeOfFlight = timeOfFlight;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightId='" + flightId + '\'' +
                ", dateOfFLight='" + dateOfFLight + '\'' +
                ", timeOfFlight='" + timeOfFlight + '\'' +
                ", numberOfPassengers=" + numberOfPassengers +
                '}';
    }

    public static class Builder{
        private String flightId;
        private String dateOfFlight;
        private String timeOfFlight;
        private int numberOfPassengers;

        public Builder setFlightId(String flightId) {
            this.flightId = flightId;
            return this;
        }

        public Builder setDate(String date) {
            this.dateOfFlight = dateOfFlight;
            return this;
        }

        public Builder setTime(String time) {
            this.timeOfFlight = timeOfFlight;
            return this;
        }

        public Builder setDateOfFlight(String dateOfFlight) {
            this.dateOfFlight = dateOfFlight;
            return this;
        }

        public Builder setTimeOfFlight(String timeOfFlight) {
            this.timeOfFlight = timeOfFlight;
            return this;
        }

        public Builder setNumberOfPassengers(int numberOfPassengers) {
            this.numberOfPassengers = numberOfPassengers;
            return this;
        }

        public Builder copy(Flight flight){
            this.flightId= flight.flightId;
            this.dateOfFlight= flight.dateOfFLight;
            this.timeOfFlight= flight.timeOfFlight;
            this.numberOfPassengers= flight.numberOfPassengers;
            return this;
        }
        public Flight builder(){
            return new Flight(this);
        }
    }
}
