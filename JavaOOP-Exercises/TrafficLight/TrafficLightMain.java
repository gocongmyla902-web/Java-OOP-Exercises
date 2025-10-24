package TrafficLight;

public class TrafficLightMain {
    public static void main(String[] args) {
        TrafficLight light = new TrafficLight("Red", 30);
        light.displayStatus();
        light.changeColor("Green");
        System.out.println("Is green ? " + light.isGreen());
    }
}
