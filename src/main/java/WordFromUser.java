import java.util.Scanner;

public class WordFromUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many words do you want to enter? ");
        int count = scanner.nextInt();

        String[] words = new String[count];

        for (int i = 0; i < count; i++) {
            System.out.print("Enter word " + (i+1) + ": ");
            words[i] = scanner.next();
            System.out.println("You entered: " + words[i]);
        }

        System.out.println("\nHere are the words you entered:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
