import java.util.Scanner;

public class Account {
    private int id;
    private String accountType;
    private double balance;

    public Account() {
        this.id = 0;
        this.accountType = "";
        this.balance = 0.0;
    }

    public Account(int id, String accountType, double balance) {
        this.id = id;
        this.accountType = accountType;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getBalance() {
        return balance;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    public String GetDetails() {
        return "Account ID: " + id + "\nAccount Type: " + accountType + "\nBalance: " + balance;
    }
}
class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account id");
        int acc_id = sc.nextInt();
        System.out.println("Enter account type");
        String acc_type = sc.next();
        System.out.println("Enter balance");
        double balance = sc.nextDouble();
        Account account = new Account(acc_id, acc_type, balance);
        System.out.println(account.GetDetails());
        System.out.println("Enter amount to withraw: ");
        double amountToWithdraw = sc.nextDouble();
        boolean result = account.withdraw(amountToWithdraw);
        if (result) {
            System.out.println("New Balance: " + account.getBalance());
        } else {
            System.out.println("Insufficient Balance");
        }
        sc.close();
    }
}
