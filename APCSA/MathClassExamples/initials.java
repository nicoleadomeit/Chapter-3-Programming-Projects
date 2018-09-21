
/*Write a program that reads in one line of input: a person’s first and last name, separated by a space. Then, have the program print that person’s initials.

Sample execution of the program:
	Program output: Enter your full name below.
	User input: Zachary Goldberg
	Program output: Your initials are ZG.

The following String methods will likely be useful for this exercise. Detailed explanations of each one can be found in the Strings powerpoint.
int length()
String substring(int from)
String substring(int from, int to)
int indexOf(String str)

Note: You can assume that the user’s input will always be formatted correctly (i.e., a first name and last name, separated by one space).

Challenge:  Same program but user enters First Middle & Last Name. 

Sample execution of the program:
	Program output: Enter your full name below.
	User input: Zachary Benjamin Goldberg
	Program output: Your initials are ZBG.*/
	
import java.util.Scanner;
	public class initials{
    public static void main(){
        Scanner s = new Scanner (System.in);
        
        System.out.println ("Please enter your full name");
        String str = s.nextLine ();
        System.out.print(str.substring (0,1));
        int x = str.indexOf (" ");
        System.out.print(str.substring (x+1,x+2));
        int y = str.indexOf (" ");
        System.out.print(str.substring (x+3,x+3));
        System.out.println(str.substring (x+1,x+2));
        //Prints Firtst and last initials//
        
        
        
    }
}
        
    

	
