public class PinrtMyName {
    public static void main(String[] args) {

        // Programm to print my name five times in a loop
        String name = "Boramy";
        for (int i = 0; i < 5; i++) {
            System.out.println(name);
        }
        System.out.println(isGreaterThanZero(7));
        System.out.println(square(20));

        System.out.println(getNumberWord(9));

        System.out.println(getNumberWord(5));
    }

    // Function for testing, if the number bigger than Zero
    public static boolean isGreaterThanZero(int x) {
        return x > 0;
    }
    //Function to calculate for quardarate
    public static int square(int y) {
        return y * y;
    }

    //Write a method that returns the given number word for a one-digit number.
    public static String getNumberWord(int num) {

        String[] numberWords = {"Eins", "Zwei", "Drei", "Vier", "Fünf", "Sechs", "Sieben", "Acht", "Neun", "Zehn"};

        //String getNumberWords = numberWords.getNumberWord(number);

        for (int i = 0; i < numberWords.length; i++) {
            if (i == num) {
                return numberWords[i];
            }
        }
        return "Number must be between 0 and 10";
    }

}
