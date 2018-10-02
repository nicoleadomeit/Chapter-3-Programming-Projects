/*Program randomly generates a value between 1 and 100. User then guesses it. 
Ask user to enter a number between 1 and 100. Tell them if their guess was too hi or lo.
Keep asking until they get the correct number. Report the # of guesses
Allow user to give up with a sentinel value (but feel free to make fun of them if they quit)
If user gets correct #, ask if they want to play again. */
import java.util.Scanner;
public class HiLowGuessingGame {
    public static void main() {
        Scanner scan = new Scanner (System.in);
        int a = ((int)(Math.random()* 100 +1));
        boolean b = true;
        int c = 0;
        while (b) {
            System.out.println ("Try to guess a number between 1 and 100. Type that number in.");
            int x = scan.nextInt();
            // for (int i = 0; i <= b; i++) {
            if (x == 0) {
                break;
            }
            else if ((x <1 || x >100)) {
                System.out.println ("This number is not within the range. Guess again.");
            }
            else if (x < a) {
                System.out.println ("This number is too low, guess again or press 0 to stop the game");;
                c = c + 1;
            }
            else if (x > a) {
                System.out.println ("This number is too high, guess again or press 0 to stop the game");
                c = c + 1;
            }
            else {
                System.out.println ("Congratulations, you have guessed the number in " +c+ " tries.");
                System.out.println ("Would you like to play again? If so, type any number or 0 to quit");
                int d = scan.nextInt();
                if (d == 0) {
                    b = false;
                }}
        }
    }
}
