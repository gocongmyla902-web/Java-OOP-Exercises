package BankAccount;

public class BankAccountMain {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount("001", "Lara", 1000, 5);
        s.applyInterest();
        s.displayBalance();
    }
}
