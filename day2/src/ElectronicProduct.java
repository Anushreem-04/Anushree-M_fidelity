public class ElectronicProduct extends Product {
    int warrantyPeriod;
    public ElectronicProduct(String productId, String productName, double price, int warrantyPeriod) {
        super(productId, productName, price);
        this.warrantyPeriod = warrantyPeriod;
    }
    public void displayElectronicProduct() {
        displayProductDetails();
        System.out.println("Warranty Period: " + warrantyPeriod + " months");
    }
}
