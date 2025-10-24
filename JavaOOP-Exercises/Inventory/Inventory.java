package Inventory;

import java.util.ArrayList;
import java.util.List;

class Inventory {
    private List<String> products = new ArrayList<>();

    public List<String> getProducts() { return products; }
    public void addProduct(String product) { products.add(product); }
    public void removeProduct(String product) { products.remove(product); }

    public void checkLowInventory() {
        if (products.size() < 3) System.out.println("Low inventory! Only " + products.size() + " items left.");
        else System.out.println("Inventory level is sufficient.");
    }

    public void showProducts() { System.out.println("Products: " + products); }
}


