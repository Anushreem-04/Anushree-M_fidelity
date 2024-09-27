import java.util.Scanner;

public class Q6StringConcatenate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First name: ");
        String firstName = sc.nextLine();
        System.out.println("Enter Last name: ");
        String lastName = sc.nextLine();
        String FullName = firstName + " " + lastName;
        System.out.println("FullName is: " + FullName);

    }
}
