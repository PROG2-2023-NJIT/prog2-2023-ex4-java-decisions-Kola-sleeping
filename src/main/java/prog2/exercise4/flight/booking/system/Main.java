package prog2.exercise4.flight.booking.system;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter passenger's full name: ");
        String passengerFullName = scanner.nextLine();
        FlightBooking flightBooking = new FlightBooking(passengerFullName);
        flightBooking.showMessage();
    }
}

