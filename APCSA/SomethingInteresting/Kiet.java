import java.util.Scanner;
public class Kiet {
    public static void main(){
        Scanner s = new Scanner(System.in);
        System.out.println ("Enter your first number");
        double num1 = s.nextDouble();
        System.out.println ("Enter your second number");
        double num2 = s.nextDouble();
        System.out.println ("Enter your third number");
        double num3 = s.nextDouble();
        double ave = ((num1 + num2 + num3)/3);
        System.out.println ("The average of " + num1 + " " + num2 + " " + num3 + " is " + ave);
        
        /*
        double Kiet = 6.0;
        double x = 100.0;
        double y = 10.0;
        System.out.println ((Kiet + x + y)/3);
        System.out.println ("What is Kiet + x");
        System.out.println (Kiet + x);
        */
    }
}

    