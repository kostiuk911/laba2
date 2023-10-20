package Task3;

public class Flight {
    private String flightNumber;
    private Plane plane;
    private Airport departureAirport;
    private Airport arrivalAirport;

    public Flight(String flightNumber, Plane plane, Airport departureAirport, Airport arrivalAirport) {
        this.flightNumber = flightNumber;
        this.plane = plane;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public Plane getPlane() {
        return plane;
    }

    public Airport getDepartureAirport() {
        return departureAirport;
    }

    public Airport getArrivalAirport() {
        return arrivalAirport;
    }
}

