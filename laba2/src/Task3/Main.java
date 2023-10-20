package Task3;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        FlightManagementSystem flightSystem = new FlightManagementSystem();

        Plane plane1 = new Plane("Boeing 737", 150);
        Airport airport1 = new Airport("Kyiv Boryspil", "Kyiv");
        Passenger passenger1 = new Passenger("John Doe", "Kyiv");
        Airport airport2 = new Airport("Lviv Danylo Halytskyi", "Lviv");

        flightSystem.addPlane(plane1);
        flightSystem.addAirport(airport1);
        flightSystem.addAirport(airport2);
        flightSystem.addPassenger(passenger1);

        Flight flight1 = new Flight("PS123", plane1, airport1, airport2);

        Date departureTime1 = new Date();
        Date arrivalTime1 = new Date();

        flightSystem.createFlightSchedule(flight1, departureTime1, arrivalTime1);

        FlightSchedule scheduleForTicket1 = flightSystem.getFlightSchedules().get(0);
        Passenger passengerForTicket1 = passenger1;
        double ticketPrice1 = 100.0;

        flightSystem.sellTicket(scheduleForTicket1, passengerForTicket1, ticketPrice1);

        Ticket ticketToCancel = flightSystem.getTickets().get(0);
        flightSystem.cancelTicket(ticketToCancel);

        Date startDate = new Date();
        Date endDate = new Date();
        double income = flightSystem.calculateIncome(startDate, endDate);

        System.out.println("Income for the period: " + income);
    }
}
