class Product {
    int proid;
    String proname;
    double price;
    public Product(int proid, String proname, double price) {
        this.proid = proid;
        this.proname = proname;
        this.price = price;
    }
    public void displayProductDetails() {
        System.out.println("Product ID: " + proid);
        System.out.println("Product Name: " + proname);
        System.out.println("Product Price: " + price);
        System.out.println("----------");
    }
}

public class display5productsQ1 {
    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product(1, "laptop", 345788.5);
        products[1] = new Product(2, "headphone", 16599.0);
        products[2] = new Product(3, "tab", 12324.98);
        products[3] = new Product(4, "phone", 12000);
        products[4] = new Product(5, "watch", 2000.0);

        System.out.println("displaying product details:\n");
        for (Product product : products) {
            product.displayProductDetails();
        }
    }
}



