import java.util.Scanner;

public class Q2SquareCubeCalc {
    static double FindSquare(double x) {
        return x * x;
    }

    static double FindCube(double x) {
        return x * x * x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side");
        double x = sc.nextDouble();
        double square = FindSquare(x);
        System.out.println("The square is " + square);
        double Cube = FindCube(square);
        System.out.println("The cube is " + Cube);
        sc.close();
    }
}