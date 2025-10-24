package TravelBooking;

class TravelBooking {
    public void searchFlights(String from, String to) { System.out.println("Searching flights from " + from + " to " + to); }
    public void searchHotels(String city) { System.out.println("Searching hotels in " + city); }
    public void bookReservation(String type, String name) { System.out.println("Booking " + type + " for " + name); }
    public void cancelReservation(String type, String name) { System.out.println(type + " reservation cancelled for " + name); }
}

