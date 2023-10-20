package Task3;

public class Ticket {
    private FlightSchedule flightSchedule;
    private Passenger passenger;
    private double price;

    public Ticket(FlightSchedule flightSchedule, Passenger passenger, double price) {
        this.flightSchedule = flightSchedule;
        this.passenger = passenger;
        this.price = price;
    }

    public FlightSchedule getFlightSchedule() {
        return flightSchedule;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public double getPrice() {
        return price;
    }
}
