/*Program asks user to enter an integer between 1 million and 1 billion.
If input not valid, re-prompts. 
Program then prints the number of odd and even digits. */
import java.util.Scanner;
public class DigitAnalysis {
    public static void main(){
        Scanner scan = new Scanner(System.in);
        System.out.println ("This is a program that will print the number of odd or even digits in an integer between 1 million and 1 billion. Please enter a number between 1 million and 1 billion");
        int odd = 0;
        int even = 0;
        int x = scan.nextInt();
        if ((x<1000000) || (x>1000000000)) {
            System.out.println ("Sorry, this number does not meet the requirements. Please enter a number between 1 million and 1 billion");
            int y = scan.nextInt();
        }
        String numberString = Integer.toString(x); 
        for (int i = 0; i < numberString.length(); i++) {
        }
    }
}

/* Scan in an integer, repromt if not between 1 mil and 1 bil
 * Rescan int if necessary and isolate the last digit using module 10
 * Divide number by 10 to 10 to get the rest of the number
 * repeat process using for loop until last digit is divided by 10 (0)*/
