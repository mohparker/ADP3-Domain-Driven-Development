package za.ac.cput.Entity;

public class FlightRoute {
    private int RouteId;
    private String flightArrivalAirport;
    private String flightDepartureAirport;

    private FlightRoute(Builder builder)
    {
        this.RouteId = builder.RouteId;
        this.flightArrivalAirport = builder.flightArrivalAirport;
        this.flightDepartureAirport = builder.flightDepartureAirport;

    }


    @Override
    public String toString() {
        return "FlightRoute{" +
                "RouteId=" + RouteId +
                ", flightArrivalAirport='" + flightArrivalAirport + '\'' +
                ", flightDepartureAirport='" + flightDepartureAirport + '\'' +
                '}';
    }

    public int getRouteId() {
        return RouteId;
    }

    public void setRouteId(int routeId) {
        RouteId = routeId;
    }

    public String getFlightArrivalAirport() {
        return flightArrivalAirport;
    }

    public void setFlightArrivalAirport(String flightArrivalAirport) {
        this.flightArrivalAirport = flightArrivalAirport;
    }

    public String getFlightDepartureAirport() {
        return flightDepartureAirport;
    }

    public void setFlightDepartureAirport(String flightDepartureAirport) {
        this.flightDepartureAirport = flightDepartureAirport;
    }


    public static class Builder
    {
        private int RouteId;
        private String flightArrivalAirport;
        private String flightDepartureAirport;

        public Builder setRouteId(int routeId) {
            RouteId = routeId;
            return this;
        }

        public Builder setFlightArrivalAirport(String flightArrivalAirport) {
            this.flightArrivalAirport = flightArrivalAirport;
            return this;
        }

        public Builder setFlightDepartureAirport(String flightDepartureAirport) {
            this.flightDepartureAirport = flightDepartureAirport;
            return this;
        }

        public Builder copy(FlightRoute flightRoute)
        {
            this.RouteId = flightRoute.RouteId;
            this.flightArrivalAirport = flightRoute.flightArrivalAirport;
            this.flightDepartureAirport = flightRoute.flightDepartureAirport;

            return this;



        }
        public FlightRoute build()
        {
            return new FlightRoute(this);
        }
    }
}
