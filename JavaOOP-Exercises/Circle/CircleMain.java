package Circle;

public class CircleMain {
    public static void main(String[] args) {
        Circle c = new Circle(5.0);
        System.out.println("Area: " + c.calculateArea());
        System.out.println("Circumference: " + c.calculateCircumference());
        c.setRadius(7.0);
        System.out.println("Updated radius  Area: " + c.calculateArea());
    }
}
