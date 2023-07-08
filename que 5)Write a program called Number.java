que 5)Write a program called NumberGuess to play the number guessing game. The program shall generate a random number between 0 and 99. The player inputs his/her guess, and the program shall response with "Try higher", "Try lower" or "You got it in n trials" accordingly.
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 100);
        int guess;
        int trials = 0;

        System.out.println("Guess a number between 0 and 99!");

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Key in your guess: ");
            guess = scanner.nextInt();
            trials++;

            if (guess < randomNumber) {
                System.out.println("Try higher");
            } else if (guess > randomNumber) {
                System.out.println("Try lower");
            }
        } while (guess != randomNumber);

        System.out.println("You got it in " + trials + " trials!");

        scanner.close();
    }
}
