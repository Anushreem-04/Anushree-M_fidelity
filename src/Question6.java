import java.util.Scanner;

public class Question6 {
    public static int Question6(int[] array){
        int sum = 0;
        for(int num : array){
            if(num%2==0){
                sum+=num;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter" + size+ "elements:");
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }
        int sum = Question6(array);
        System.out.println("The sum of the even numbers in the array is: "+sum);
    }
}
