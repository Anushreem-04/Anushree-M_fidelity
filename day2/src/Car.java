public class Car extends Vehicle {
    int numberOfDoors;
    public Car(String brand, int year,int numberOfDoors) {
        super(brand, year);
        this.numberOfDoors = numberOfDoors;
    }
    public void displayCarDetails() {
        super.displayDetails();
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}
