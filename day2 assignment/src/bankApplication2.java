import java.util.Scanner;
class Account{
    private int accno;
    private String accname;
    private double balance;

    public Account(int accno, String accname, double balance) {
        this.accno = accno;
        this.accname = accname;
        this.balance = balance;
    }
    public void deposit(double amount) {
        if(amount>0){
            balance+=amount;
            System.out.println("Successfully deposited $"+amount);
        }else{
            System.out.println("deposit amount should be greater than zero");
        }
    }
    public void withdraw(double amount) {
        if(amount > 0 && amount <=balance ){
            balance-=amount;
            System.out.println("Successfully withdrawn $"+amount);
        }else if(amount > balance){
            System.out.println("Insufficient balance for withdrawal ");
        }else{
            System.out.println("withdrawal amount should be greater than zero");
        }
    }
    public double checkBalance(){
        return balance;
    }
    public void displayAccountDetails(){
        System.out.println("\nAccount details:");
        System.out.println("Account no. : "+accno);
        System.out.println("Account name: "+accname);
        System.out.println("Account balance : "+balance);
    }
}
public class bankApplication2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account account = new Account(100,"smitha",500);
        while(true){
            System.out.println("select an action");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check balance");
            System.out.println("4.display account details");
            System.out.println("5. Exit");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter amount to deposit:");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;
                 case 2:
                     System.out.println("Enter amount to withdraw:");
                     double withdrawAmount = sc.nextDouble();
                     account.withdraw(withdrawAmount);
                     break;
                 case 3:
                     System.out.println("Current balance: "+account.checkBalance());
                     break;
                case 4:
                    account.displayAccountDetails();
                    break;
                case 5:
                    System.out.println("Exit application");
                    sc.close();
                    return;
                 default:
                     System.out.println("Invalid choice");
            }
        }
    }
}
