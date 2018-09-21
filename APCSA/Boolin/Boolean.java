/*
import java.util.Scanner;
public class Boolean{
    public static void main(String[] args){ 
        Scanner scan = new Scanner (System.in);
        System.out.println ("How many hours of sleep did you get last night?");
        int hrsOfSleep = scan.nextInt();
        if (hrsOfSleep < 5){
            System.out.println ("Go to bed earlier");
        }
        else if (hrsOfSleep < 8){
            System.out.println ("You gonna be a little tired today");
        }
        else {
            System.out.println ("Kiet says good job");
        }
    }
}
*/
import java.util.Scanner;
public class Boolean{
    public static void main(){
    Scanner scan = new Scanner (System.in);
    int num = -1;
    while (!(num>= 10 && num<=20)){
        System.out.println ("Enter a number between 10 and 20: ");
        num = scan.nextInt();
        
    }
    System.out.println ("Thank you!");
}
}

            /*
             * public static boolean opposite (boolean opp){
            return (!opp);
            }

            public static boolean lengthEqualToString (String str , int num){
            return str.length() == num;
             */