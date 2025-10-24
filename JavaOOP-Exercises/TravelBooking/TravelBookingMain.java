package TravelBooking;

public class TravelBookingMain {
    public static void main(String[] args) {
        TravelBooking tb = new TravelBooking();
        tb.searchFlights("Manila", "Tokyo");
        tb.bookReservation("Flight", "Myla");
        tb.cancelReservation("Flight", "Myla");
    }
}
