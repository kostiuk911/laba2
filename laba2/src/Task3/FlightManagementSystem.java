package Task3;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FlightManagementSystem {
    private List<Plane> planes;
    private List<Airport> airports;
    private List<Passenger> passengers;
    private List<Flight> flights;
    private List<FlightSchedule> flightSchedules;
    private List<Ticket> tickets;

    public FlightManagementSystem() {
        planes = new ArrayList<>();
        airports = new ArrayList<>();
        passengers = new ArrayList<>();
        flights = new ArrayList<>();
        flightSchedules = new ArrayList<>();
        tickets = new ArrayList<>();
    }

    // Add methods for adding planes, airports, passengers, and flights
    public void addPlane(Plane plane) {
        planes.add(plane);
    }

    public void createFlightSchedule(Flight flight, Date departureTime, Date arrivalTime) {
        FlightSchedule flightSchedule = new FlightSchedule(flight, departureTime, arrivalTime);
        flightSchedules.add(flightSchedule);
    }


    public void addAirport(Airport airport) {
        airports.add(airport);
    }

    public void addPassenger(Passenger passenger) {
        passengers.add(passenger);
    }

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    // Add methods for adding flight schedules and selling tickets
    public void addFlightSchedule(FlightSchedule flightSchedule) {
        flightSchedules.add(flightSchedule);
    }

    public void sellTicket(FlightSchedule flightSchedule, Passenger passenger, double price) {
        Ticket ticket = new Ticket(flightSchedule, passenger, price);
        tickets.add(ticket);
    }

    // Add a method for canceling a ticket
    public void cancelTicket(Ticket ticket) {
        tickets.remove(ticket);
    }

    // Add a method for calculating income for a given period of time
    public double calculateIncome(Date startDate, Date endDate) {
        double income = 0;
        for (Ticket ticket : tickets) {
            if (ticket.getFlightSchedule().getDepartureTime().after(startDate) &&
                    ticket.getFlightSchedule().getDepartureTime().before(endDate)) {
                income += ticket.getPrice();
            }
        }
        return income;
    }

    // Getters for lists
    public List<Plane> getPlanes() {
        return planes;
    }

    public List<Airport> getAirports() {
        return airports;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public List<FlightSchedule> getFlightSchedules() {
        return flightSchedules;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }
}
