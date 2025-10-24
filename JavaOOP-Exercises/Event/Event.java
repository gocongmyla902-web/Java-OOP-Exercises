package Event;

import java.util.ArrayList;

class Event {
    private String eventName;
    private String date;
    private String location;

    public Event(String eventName, String date, String location) {
        this.eventName = eventName;
        this.date = date;
        this.location = location;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void displayDetails() {
        System.out.println("Event Name: " + eventName);
        System.out.println("Date: " + date);
        System.out.println("Location: " + location);
    }

    public boolean checkConflict(String otherDate) {
        return this.date.equalsIgnoreCase(otherDate);
    }
}

class Seminar extends Event {
    private int numberOfSpeakers;

    public Seminar(String eventName, String date, String location, int numberOfSpeakers) {
        super(eventName, date, location);
        this.numberOfSpeakers = numberOfSpeakers;
    }

    // Getters and Setters
    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public void setNumberOfSpeakers(int numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Speakers: " + numberOfSpeakers);
    }
}

class MusicalPerformance extends Event {
    private ArrayList<String> performerList;

    public MusicalPerformance(String eventName, String date, String location) {
        super(eventName, date, location);
        performerList = new ArrayList<>();
    }

    
    public ArrayList<String> getPerformerList() {
        return performerList;
    }

    public void setPerformerList(ArrayList<String> performerList) {
        this.performerList = performerList;
    }

    public void addPerformer(String performer) {
        performerList.add(performer);
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Performers: " + performerList);
    }
}

