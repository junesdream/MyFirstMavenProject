import java.util.Scanner;
public class GreetingUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, insert your name: ");
        String name = scanner.nextLine();
        System.out.println("Hi " + name + "! " + "How are you? ");
    }
}
