import java.util.Scanner;
//base class
class Employee{
    protected int employeeID;
    protected String employeeName;
    protected float basicSalary;
    protected float bonus;
    protected float netSalary;

    //constructor to initialize employee details
    public Employee(int employeeID, String employeeName, float basicSalary){
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
        this.bonus = 0;
        this.netSalary = 0;
    }
    public void calculateNetSalary(){

    }
    public void calculateBonus(){

    }
    public void displayDetails(){
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee Basic Salary: " + basicSalary);
        System.out.println("Employee Bonus: " + bonus);
        System.out.println("Employee Net Salary: " + netSalary);
    }

}
class PermanentEmployee extends Employee{
    private int pf;
    public PermanentEmployee(int employeeID, String employeeName, float basicSalary, int pf){
        super(employeeID, employeeName, basicSalary);
        this.pf = pf;
    }
    @Override
    public void calculateNetSalary(){
        netSalary += basicSalary - pf;
    }
    @Override
    public void calculateBonus(){
        if (pf<1000){
            bonus = 0.10f*basicSalary;
        }else if (pf>=1000 && pf<1500){
            bonus=0.115f*basicSalary;
        }else if (pf>=1500 && pf<1800){
            bonus=0.12f*basicSalary;
        }else{
            bonus=0.15f*basicSalary;
        }
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("PF: " + pf);

    }
}
class TemporaryEmployee extends Employee{
    private int dailyWages;
    private int noOfDays;

    public TemporaryEmployee(int employeeID,String employeeName, int dailyWages, int noOfDays){
        super(employeeID, employeeName, dailyWages);
        this.dailyWages = dailyWages;
        this.noOfDays = noOfDays;
    }
    @Override
    public void calculateNetSalary(){
        netSalary += dailyWages * noOfDays;
    }
    @Override
    public void calculateBonus(){
        if(dailyWages < 1000){
            bonus = 0.15f * netSalary;
        }else if (dailyWages >= 1000 && dailyWages < 1500){
            bonus = 0.12f * netSalary;
        }else if(dailyWages >= 1500 && dailyWages < 1750){
            bonus = 0.11f * netSalary;
        }else{
            bonus = 0.08f * netSalary;
        }
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Daily Wages: " + dailyWages);
        System.out.println("No. of Days: " + noOfDays);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter details of permanent employee: ");
        System.out.println("Enter Employee ID: ");
        int employeeID = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Employee Name: ");
        String employeeName = sc.nextLine();
        System.out.println("Enter Employee Basic Salary: ");
        float basicSalary = sc.nextFloat();
        System.out.println("PF ");
        int pf = sc.nextInt();

        PermanentEmployee permanentEmployee = new PermanentEmployee(employeeID, employeeName, basicSalary, pf);
        permanentEmployee.calculateBonus();
        permanentEmployee.calculateNetSalary();
        System.out.println("Details for Permanent Employee: ");
        permanentEmployee.displayDetails();
        System.out.println();

        System.out.println("Enter details of temporary employee: ");
        System.out.print("Employee ID: ");
        employeeID = sc.nextInt();
        sc.nextLine();
        System.out.print("Employee Name: ");
        employeeName = sc.nextLine();
        System.out.print("Daily Wages: ");
        int dailyWages = sc.nextInt();
        System.out.print("No. of Days worked: ");
        int noOfDays = sc.nextInt();

        TemporaryEmployee temporaryEmployee = new TemporaryEmployee(employeeID, employeeName, dailyWages, noOfDays);
        temporaryEmployee.calculateBonus();
        temporaryEmployee.calculateNetSalary();
        System.out.println("Details for Temporary Employee: ");
        temporaryEmployee.displayDetails();
    }

}

