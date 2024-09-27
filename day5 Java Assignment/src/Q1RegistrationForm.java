import java.util.Scanner;

public class Q1RegistrationForm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Enter your Country: ");
        String country = sc.next();
        System.out.println("Welcome "+name+".Your age is "+age+"and you are from "+country);
        sc.close();
    }
}