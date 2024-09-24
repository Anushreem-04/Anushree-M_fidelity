import java.util.Scanner;

public class Question1Averagecalculator {
    public static double calculateAverage(int[] numbers){
        int sum = 0;
        for (int number : numbers) {
            sum+=number;
        }
        double average =(double)sum/numbers.length;
        return average;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of numbers you want to average: ");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter" +size+ "numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        double average = calculateAverage(numbers);
        System.out.println("The average is: " + average);
    }
}
