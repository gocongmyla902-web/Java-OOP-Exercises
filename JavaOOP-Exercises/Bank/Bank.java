package Bank;

import java.util.ArrayList;
import java.util.List;

    class Account {
    private String accountNumber;
    private String customerName;
    private double balance;

    public Account(String accountNumber, String customerName, double balance) { this.accountNumber = accountNumber; this.customerName = customerName; this.balance = balance; }

    public String getAccountNumber() { return accountNumber; }
    public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }

    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }

    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }

    public void deposit(double amount) { balance += amount; }
    public void withdraw(double amount) {
        if (amount <= balance) balance -= amount;
        else System.out.println("Insufficient balance!");
    }
    public void displayAccount() { System.out.println("Account: " + accountNumber + ", Name: " + customerName + ", Balance: " + balance); }
}

    public class Bank {
    private List<Account> accounts = new ArrayList<>();

    public List<Account> getAccounts() { return accounts; }
    public void addAccount(Account acc) { accounts.add(acc); System.out.println("Account added: " + acc.getAccountNumber()); }
    public void removeAccount(Account acc) { accounts.remove(acc); System.out.println("Account removed: " + acc.getAccountNumber()); }
    public void showAccounts() { for (Account a : accounts) a.displayAccount(); }
}


