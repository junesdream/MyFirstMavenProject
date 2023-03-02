public class LoopExer {
    public static void main(String[] args) {

        System.out.println(calculateFactorial(2));
        System.out.println(calculateFactorialWhile(3));
    }

    // Methode for loop
    public static int calculateFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            // result = result * i;
            result *= i;
        }
        return result;
    }

    // Methode with while
    public static int calculateFactorialWhile(int n) {
        int result = 1;
        int i = 2;
        while (i <= n) {
            result *= i;
            i++;
        }
        return result;
    }
}
