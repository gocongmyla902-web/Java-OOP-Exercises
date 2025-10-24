package TrafficLight;

class TrafficLight {
    private String color;
    private int duration; 

    public TrafficLight(String color, int duration) { this.color = color; this.duration = duration; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public int getDuration() { return duration; }
    public void setDuration(int duration) { this.duration = duration; }

    public void changeColor(String newColor) { setColor(newColor); }
    public boolean isRed() { return "red".equalsIgnoreCase(color); }
    public boolean isGreen() { return "green".equalsIgnoreCase(color); }
    public void displayStatus() { System.out.println("Color: " + color + " (" + duration + "s)"); }
}

