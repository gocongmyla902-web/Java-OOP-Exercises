package Building;

public class BuildingMain {
    public static void main(String[] args) {
        ResidentialBuilding rb = new ResidentialBuilding("123 Palm Street", 10, 5000.0, 20, 12000.0);
        CommercialBuilding cb = new CommercialBuilding("45 Business Ave", 8, 7000.0, 15, 20000.0);

        System.out.println(" Residential Building Details:");
        rb.displayDetails();

        System.out.println("Commercial Building Details:");
        cb.displayDetails();
    }
}
