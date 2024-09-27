import java.util.Scanner;

public class Calculator {
    public int addition(int a, int b) {
        return a + b;
    }
    public int subtraction(int a, int b) {
        return a - b;
    }
    public int multiplication(int a, int b) {
        return a * b;
    }
    public double division(int a, int b, double[] remainder) {
        remainder[0] = a % b;
        return (double)a / b;
    }
}
class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        System.out.println("Enter the first operand: ");
        int operand1 = sc.nextInt();
        System.out.println("Enter the Operator(+,-,*,/):");
        char operator = sc.next().charAt(0);
        System.out.println("Enter the second operand: ");
        int operand2 = sc.nextInt();

        switch (operator) {
            case '+':
                System.out.println("Result of " + operand1 + "+" + operand2 + "is" + calc.addition(operand1, operand2));
                break;
            case '-':
                System.out.println("Result of " + operand1 + "-" + operand2 + "is" + calc.subtraction(operand1, operand2));
                break;
            case '*':
                System.out.println("Result of " + operand1 + "*" + operand2 + "is" + calc.multiplication(operand1, operand2));
                break;
            case '/':
                if (operand2 != 0) {
                    double[] remainder = new double[1];
                    double quotient = calc.division(operand1, operand2, remainder);
                    System.out.println("Result of " + operand1 + "/" + operand2 + "is" + (int) quotient);
                    System.out.println("Remainder=" + (int) remainder[0]);
                } else {
                    System.out.println("Division by zero is not allowed");
                }
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }
        sc.close();
    }
}
