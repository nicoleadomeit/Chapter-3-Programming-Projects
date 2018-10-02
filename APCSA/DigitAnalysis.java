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
        if (x > 1000000000 || x < 1000000) {
            System.out.println ("Sorry, this number does not meet the requirements. Please enter a number between 1 million and 1 billion");
            int y = scan.nextInt();
        }
        String s = Integer.toString(x); 
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if ((int) a % 2 == 0) {
                even++;
            } else if ((int) a % 2 == 1) {
                odd++;
            }
        }
        System.out.println("There are " + even + " even numbers and there are " + odd+ " odd numbers");
    }
}
