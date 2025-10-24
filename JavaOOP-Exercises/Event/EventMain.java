package Event;

public class EventMain {
    public static void main(String[] args) {
        Seminar seminar = new Seminar("Tech Innovations 2025", "2025-11-15", "Manila Convention Center", 5);
        MusicalPerformance concert = new MusicalPerformance("Live Jam Night", "2025-11-15", "Araneta Coliseum");

        concert.addPerformer("SB19");
        concert.addPerformer("Ben&Ben");
        concert.addPerformer("Zild");

        System.out.println("Seminar Details:");
        seminar.displayDetails();

        System.out.println(" Musical Performance Details:");
        concert.displayDetails();

        if (seminar.checkConflict(concert.getDate())) {
            System.out.println(" Conflict detected! Both events are scheduled on " + concert.getDate());
        } else {
            System.out.println(" No schedule conflict.");
        }
    }
}
