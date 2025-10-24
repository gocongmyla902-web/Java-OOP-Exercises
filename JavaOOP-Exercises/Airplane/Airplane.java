package Airplane;

class Airplane {
    private String flightNumber;
    private String destination;
    private String departureTime;
    private boolean delayed;

    public Airplane(String flightNumber, String destination, String departureTime) {
        this.flightNumber = flightNumber; this.destination = destination; this.departureTime = departureTime; this.delayed = false;
    }

    public String getFlightNumber() { return flightNumber; }
    public void setFlightNumber(String flightNumber) { this.flightNumber = flightNumber; }

    public String getDestination() { return destination; }
    public void setDestination(String destination) { this.destination = destination; }

    public String getDepartureTime() { return departureTime; }
    public void setDepartureTime(String departureTime) { this.departureTime = departureTime; }

    public boolean isDelayed() { return delayed; }
    public void setDelayed(boolean delayed) { this.delayed = delayed; }

    public void delayFlight() { setDelayed(true); }
    public void checkStatus() {
        System.out.println("Flight " + flightNumber + " to " + destination + " at " + departureTime + (delayed ? " is delayed." : " is on time."));
    }
}


