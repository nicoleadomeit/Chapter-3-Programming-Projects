/*User enters a String
Program determines if the String is a palindrome,
ignoring spaces, punctuation, and capitalization. So “aBc C, b A.” would be a palindrome.*/
import java.util.Scanner;
public class PalindromeTester {
    public static void main() {
        Scanner scan = new Scanner (System.in);
        System.out.println ("This is a palindrome tester. Enter a potential palindrome");
        String word = scan.nextLine();
        String convert = word.toLowerCase(); //ignore caps
        String reverse = new StringBuffer(word).reverse().toString(); //reverse string
        word = word.replaceAll(" ", ""); //ignores and space
        word = word.replaceAll("!", ""); //ignore exclamation point
        if (reverse.equals(word)) {
            System.out.println ("This is a palindrome");
        }
        else {
            System.out.println ("This is not a palindrome");
        }
    }
}
