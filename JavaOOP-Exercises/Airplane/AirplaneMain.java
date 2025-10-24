package Airplane;

public class AirplaneMain {
    public static void main(String[] args) {
        Airplane plane = new Airplane("PR123", "Tokyo", "10:00 AM");
        plane.checkStatus();
        plane.delayFlight();
        plane.checkStatus();
    }
}