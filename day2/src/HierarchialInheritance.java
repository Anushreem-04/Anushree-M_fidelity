public class HierarchialInheritance {
    public static void main(String[] args) {
        Car car=new Car("Toyota",2021,4);
        System.out.println("car details");
        car.displayCarDetails();
        System.out.println();
        Bike bike=new Bike("Harley Davidson",2020,"Cruiser");
        System.out.println("bike details");
        bike.displayBikeDetails();
    }
}
