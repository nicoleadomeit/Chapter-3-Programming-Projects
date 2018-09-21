/*
Program asks user to enter a year from the Gregorian calendar (after 1582). User enters a year, program tells the person if it is a leap year or not. 
The program should repeat over and over until the user enters a sentinel value to end the program. Leap years only exist after 1582, so if the year 
isn’t bigger then that it should re-prompt the user. A year is a leap year if it is divisible by 4, unless it is also divisible by 100 but not 400.
 */
import java.util.Scanner;
public class LeapYearProgram {
    public static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.println ("Please enter a year after the year of 1582.");
        int x = scan.nextInt();
        if (!(x<=1582)) {
            if (x%4==0) {
                System.out.println ("This year is a leap year");
            }
            else {
                System.out.println ("This year is not a leap year");
            }
        }
        else {
            System.out.println ("This is before Leap Year was recognized");
    }
}
}

