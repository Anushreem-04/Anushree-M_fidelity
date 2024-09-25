public class Bike extends Vehicle {
    String type;
    public Bike(String brand, int year, String type){
        super(brand, year);
        this.type = type;
    }
    public void displayBikeDetails(){
        super.displayDetails();
        System.out.println("Bike Type: " + type);
    }
}
