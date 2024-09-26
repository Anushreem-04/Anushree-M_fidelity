import java.util.Scanner;
class Person {
    private String name;
    public String gender;
    public int age;
    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    public void displayPersonDetails(){
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);

    }
}
public class PersonQ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the person: ");
        String name = sc.nextLine();
        System.out.println("Enter the gender of the person: ");
        String gender = sc.nextLine();
        System.out.println("Enter the age of the person: ");
        int age = sc.nextInt();
        Person person = new Person(name, gender, age);
        person.displayPersonDetails();
    }
}
