package Rectangle;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5.0, 3.0);
        System.out.println("Area: " + rect.getArea());
        System.out.println("Perimeter: " + rect.getPerimeter());
        rect.setWidth(6.0);
        System.out.println("New Width: " + rect.getWidth() + ", Area: " + rect.getArea());
    }
}
