import java.util.Scanner;

public class Q3BooleanResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int x = sc.nextInt();
        System.out.println("Enter the second number: ");
        int y = sc.nextInt();
        boolean result = x < y;
        System.out.println("The result of whether x is less than y is: "+ result);
        sc.close();
    }

}
