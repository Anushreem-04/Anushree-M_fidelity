import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;
class Employee{
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\''+
                ",salary=" + salary +
                '}';
    }
}
public class EmployeeFilter {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Jack", 50000));
        employees.add(new Employee(2, "Anu", 50000));
        employees.add(new Employee(3, "Bob", 50000));
        employees.add(new Employee(4, "Arya", 60000));
        employees.add(new Employee(5, "Arun", 70000));
        List<Employee> filteredEmployees=employees.stream().filter(e -> e.getName().startsWith("A")).collect(Collectors.toList());
        System.out.println("Employees whose names start with 'A':");
        filteredEmployees.forEach(e -> System.out.println(e.getName()));

    }
}
