package Restaurant;

public class RestaurantMain {
    public static void main(String[] args) {
        Restaurant r = new Restaurant();
        r.addItem("Burger", 120);
        r.addItem("Pizza", 250);
        r.rate(4.5);
        r.rate(5.0);
        r.showMenu();
    }
}
