package Shape;

public class ShapeMain {
    public static void main(String[] args) {
        Shape rect = new RectangleShape(4, 5);
        Shape circle = new CircleShape(3);
        Shape tri = new TriangleShape(3, 4, 5);
        System.out.println("Rectangle Area: " + rect.area());
        System.out.println("Circle Perimeter: " + circle.perimeter());
        System.out.println("Triangle Area: " + tri.area());
    }
}

