class Account {
    String name;
    int accountNumber;
    Account(String name, int accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
    }
    void displayDetails() {
        System.out.println("Account Holder: " + name);
        System.out.println("Account Number: " + accountNumber);
    }
}
class SavingsAccount extends Account {
    SavingsAccount(String name, int accountNumber) {
        super(name, accountNumber);
    }
    void displaySavings() {
        System.out.println("Account Type: Savings Account");
    }
}
class CurrentAccount extends Account {
    CurrentAccount(String name, int accountNumber) {
        super(name, accountNumber);
    }
    void displayCurrent() {
        System.out.println("Account Type: Current Account");
    }
}
class PremiumSavingsAccount extends SavingsAccount {
    PremiumSavingsAccount(String name, int accountNumber) {
        super(name, accountNumber);
    }
    void displayPremium() {
        System.out.println("Account Type: Premium Savings Account");
    }
}
public class Exp_4 {
    public static void main(String[] args) {
        SavingsAccount savings =
            new SavingsAccount("Arun", 1001);
        CurrentAccount current =
            new CurrentAccount("Priya", 1002);
        PremiumSavingsAccount premium =
            new PremiumSavingsAccount("Rahul", 1003);
        System.out.println("----- Savings Account -----");
        savings.displayDetails();
        savings.displaySavings();
        System.out.println("\n----- Current Account -----");
        current.displayDetails();
        current.displayCurrent();
        System.out.println("\n----- Premium Savings Account -----");
        premium.displayDetails();
        premium.displaySavings();
        premium.displayPremium();
    }
}
