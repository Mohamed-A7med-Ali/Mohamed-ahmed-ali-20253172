import java.util.Scanner;

public class Main {

    public static int generateSecret() {
        return (int) (Math.random() * 50) + 1;
    }

    public static String checkGuess(int guess, int secret) {
        if (guess == secret) {
            return "Correct";
        } else if (guess < secret) {
            return "Higher";
        } else {
            return "Lower";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int secret = generateSecret();
        int[] guesses = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Guess: ");
            guesses[i] = input.nextInt();

            String result = checkGuess(guesses[i], secret);

            if (result.equals("Correct")) {
                System.out.println("Correct in " + (i + 1) + " attempts");
                return;
            } else {
                System.out.println(result);
            }
        }

        System.out.println("Secret Number: " + secret);
    }
}