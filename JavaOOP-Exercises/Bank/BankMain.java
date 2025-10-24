package Bank;

public class BankMain {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Account a1 = new Account("001", "Alice", 1000);
        Account a2 = new Account("002", "Bob", 2000);
        bank.addAccount(a1);
        bank.addAccount(a2);
        a1.deposit(500);
        a2.withdraw(300);
        bank.showAccounts();
    }
}