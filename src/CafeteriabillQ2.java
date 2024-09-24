import java.util.Scanner;

public class CafeteriabillQ2 {
    final static int Pizza_Price=200, Puff_Price=40,Pepsi_Price=120;
    public static int calculateTotal(int quantity, int price){
        return quantity*price;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of pizzas: ");
        int totalPizzacost = calculateTotal(sc.nextInt(), Pizza_Price);
        System.out.println("Enter the number of puffs: ");
        int totalPuffcost= calculateTotal(sc.nextInt(), Puff_Price);
        System.out.println("Enter the number of pepsi: ");
        int totalPepsicost= calculateTotal(sc.nextInt(), Pepsi_Price);

        int grandTotal = totalPizzacost + totalPuffcost + totalPepsicost;
        System.out.println("---Bill Details---");
        System.out.println("Total Pizza Cost: "+totalPizzacost);
        System.out.println("Total Puff Cost: "+totalPuffcost);
        System.out.println("Total Pepsi Cost: "+totalPepsicost);
        System.out.println("Grand Total Cost: "+grandTotal);
    }

}
