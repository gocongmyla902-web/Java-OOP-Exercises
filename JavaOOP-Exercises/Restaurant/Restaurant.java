package Restaurant;

import java.util.HashMap;
import java.util.Map;

class Restaurant {
    private Map<String, Double> menu = new HashMap<>();
    private double totalRating = 0;
    private int ratingCount = 0;

    public Map<String, Double> getMenu() { return menu; }
    public void addItem(String item, double price) { menu.put(item, price); }
    public void removeItem(String item) { menu.remove(item); }

    public double getTotalRating() { return totalRating; }
    public int getRatingCount() { return ratingCount; }
    public void rate(double rating) { totalRating += rating; ratingCount++; }
    public double getAverageRating() { return ratingCount == 0 ? 0 : totalRating / ratingCount; }

    public void showMenu() { System.out.println("Menu: " + menu + " | Avg Rating: " + getAverageRating()); }
}

