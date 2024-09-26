import java.util.Scanner;
class Vehicle{
    protected String registrationNumber;
    protected String brand;

    public Vehicle(String registrationNumber, String brand){
        this.registrationNumber = registrationNumber;
        this.brand = brand;
    }
    public double calculateParkingFee(){
        return 0;
    }
    public void displayDetails(){
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Brand: " + brand);
    }
}
class Car extends Vehicle{
    private int numDoors;
    public Car(String registrationNumber, String brand, int numDoors){
        super(registrationNumber, brand);

    }
    @Override
    public double calculateParkingFee(){
        return 50.0;
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Number of Doors: " + numDoors);
    }
}
class Motorcycle extends Vehicle{
    private String engineType;
    public Motorcycle(String registrationNumber, String brand, String engineType){
        super(registrationNumber, brand);
        this.engineType = engineType;
    }
    @Override
    public double calculateParkingFee(){
        return 30.0;
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Engine Type: " + engineType);
    }
}
public class ParkingLotQ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter car details: ");
        System.out.println("Registration number: ");
        String carregNum = sc.nextLine();
        System.out.println("Brand: ");
        String carbrand = sc.nextLine();
        System.out.println("Number of Doors: ");
        int numDoors = sc.nextInt();
        sc.nextLine();
        Car car=new Car(carregNum, carbrand, numDoors);
        car.displayDetails();
        System.out.println("parking fee for car: $" + car.calculateParkingFee());

        System.out.println("\nEnter motorcycle details: ");
        System.out.println("Registration number: ");
        String motoRegNo = sc.nextLine();
        System.out.println("Brand: ");
        String motoBrand = sc.nextLine();
        System.out.println("Engine Type: ");
        String engineType = sc.nextLine();
        Motorcycle motorcycle= new Motorcycle(motoRegNo, motoBrand, engineType);
        motorcycle.displayDetails();
        System.out.println("parking fee for motorcycle: $ " + motorcycle.calculateParkingFee());
    }
}
