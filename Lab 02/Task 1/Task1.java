import java.util.Scanner;

class BankAccount {

    static String bankName = "City Bank";
    static int totalAccounts = 0;

    String accountHolder;
    double balance;
    int accountNumber;

    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        totalAccounts++;
        this.accountNumber = 1000 + totalAccounts;
    }

    void displayInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }

    static void displayBankInfo() {
        System.out.println("Bank: " + bankName);
        System.out.println("Total Accounts Opened: " + totalAccounts);
    }
}

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account holder name: ");
        String name = sc.nextLine();

        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();

        BankAccount acc1 = new BankAccount(name, balance);
        BankAccount acc2 = new BankAccount("Nabila", 15000);

        acc1.displayInfo();
        acc2.displayInfo();

        BankAccount.displayBankInfo();

        sc.close();
    }
}