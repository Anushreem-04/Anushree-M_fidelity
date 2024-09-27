import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
    private static final long serialVersionUID = 1L;
    String name;
    int age;
    String position;
    public Employee(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Position: " + position);
    }
}
public class Serialize {
    public static void main(String[] args) {
        Employee emp = new Employee("anu",21,"SE");
        try(FileOutputStream fileOut = new FileOutputStream("employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut)){
            out.writeObject(emp);
            System.out.println("Object serialized and save to employee.ser");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
