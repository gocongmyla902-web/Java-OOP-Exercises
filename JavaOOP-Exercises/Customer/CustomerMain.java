package Customer;

    public class CustomerMain {
    public static void main(String[] args) {
        LoyalCustomer customer = new LoyalCustomer("Jane Doe", "jane@example.com", 10);

        customer.addPurchase(1000);
        customer.addPurchase(500);
        customer.addPurchase(1500);

        customer.displayCustomerInfo();

        double total = customer.calculateTotalExpenditure();
        double discountedTotal = customer.applyDiscount(total);

        System.out.println("Total After Discount: ₱" + discountedTotal);
    }
}
