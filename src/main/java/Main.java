import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Write a sentence:");
        String word;
        Scanner scanner = new Scanner(System.in);
        word = scanner.nextLine();
        word = word.trim();
        String reverseWords = new StringBuffer(word).reverse().toString();

        String[] split = reverseWords.split(" ");
        String result = "";

        for (int i = split.length - 1; i >= 0; i--) {

            if (i == 0) {
                result += split[i];
            }
            else {
                result += (split[i] + " ");
            }
        }

        System.out.println("Words before reversing: " + word);
        System.out.println("Words after reversing: " + result);
    }
}