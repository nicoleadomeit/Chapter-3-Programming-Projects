/*User enters a String
Program prints it to the terminal window one character per line.*/
import java.util.Scanner;
public class StringsToCharacters {
    public static void main(){
        Scanner scan = new Scanner(System.in);
        System.out.println ("This program prints a string to the terminal window with one character per line");
        System.out.println ("Please enter a sentence");
        int x;
        x = 0;
        String string = scan.nextLine();
        for(int i=0; i<string.length();i++)
            System.out.println(string.charAt(i));
    }
}