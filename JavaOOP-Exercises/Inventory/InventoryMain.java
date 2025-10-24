package Inventory;

public class InventoryMain {
    public static void main(String[] args) {
        Inventory inv = new Inventory();
        inv.addProduct("Laptop");
        inv.addProduct("Mouse");
        inv.showProducts();
        inv.checkLowInventory();
    }
}
