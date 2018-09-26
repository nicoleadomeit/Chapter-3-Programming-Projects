import java.util.Scanner;
public class LeapYearProgram {
    public static void main() {
        boolean Nicole = true;
        Scanner scan = new Scanner(System.in);
        System.out.println ("Please enter a year after the year of 1582.");
        int x = scan.nextInt();
        while (Nicole) {
            if (((x>1582) && ((x%4==0)) && (!(x%100==0) (x%400==0)) {
                System.out.println ("This year is a leap year");
            }
            else if ((x>1582) && (!(x%4==0))){
                System.out.println ("This year is not a leap year");
            }
            else if (x<=1582) {
            System.out.println ("This is before Leap Year was recognized");
        }
        }
        System.out.println ("Please enter another year after 1582. Enter 0 to quit the game.");
        int y = scan.nextInt();
        if (y == 0) {
            Nicole = false;
        }
    }
}



