public class MobilePhone extends ElectronicProduct{
    String operatingSystem;
    public MobilePhone(String productId,String productName, double price, int warrantyPeriod, String operatingSystem) {
        super(productId, productName, price, warrantyPeriod);
        this.operatingSystem = operatingSystem;
    }
    public void displayMobilePhoneDetails(){
        super.displayElectronicProduct();
        System.out.println("Operating System: " + operatingSystem);
    }
}
