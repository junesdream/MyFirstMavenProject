
// Write a program that outputs the numbers 1-100
public class printNumberOneToHundred {
    public static void  main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print("#");
            }
            if (i % 5 == 0) {
                System.out.print("$");
            }
            System.out.print(i);
            System.out.print(" ");
        }
    }
}
