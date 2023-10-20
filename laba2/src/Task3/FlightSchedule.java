package Task3;

import java.util.Date;

public class FlightSchedule {
    private Flight flight;
    private Date departureTime;
    private Date arrivalTime;

    public FlightSchedule(Flight flight, Date departureTime, Date arrivalTime) {
        this.flight = flight;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    public Flight getFlight() {
        return flight;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public Date getArrivalTime() {
        return arrivalTime;
    }
}

