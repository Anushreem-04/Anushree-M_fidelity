import java.util.Scanner;

public class Q7ReverseSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String input = sc.nextLine();
        String[] sentence = input.split(" ");
        StringBuilder reversedSentence = new StringBuilder();
        for( int i = sentence.length - 1 ; i>=0; i--){
            reversedSentence.append(sentence[i]).append(" ");
        }
        System.out.println(reversedSentence.toString().trim());
        sc.close();
    }
}
