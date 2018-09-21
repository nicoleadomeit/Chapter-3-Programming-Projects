/* Most important String methods
 * 
 * int length()
 * String substring(int from)
 * String substring(int from, int to)
 * int indexOf()
 * 
 * Remember - methods are called by using the 'dot' operator
 */
import java.util.Scanner;
public class StringStuff{
    public static void main(){
        //Here's an example of each of these methods
        String str = "ABCDEFGHIJ";
        System.out.println ("The message is:  "+str);
        System.out.println ("Length of message is:  "+str.length());
        System.out.println ("Message without first character is:  "+str.substring(1));
        System.out.println ("Message from 3rd to 7th character is:  "+str.substring(2,7));
        System.out.println ("The first occurence of the letter F is at index:  "+str.indexOf("F"));

        //Now - let’s have the user enter information and do the same things.
        //Ask the user to enter a message
        System.out.println ("Please enter a message ");
        //Create a variable and store the users input into that variable
        Scanner s = new Scanner (System.in);
        String message = s.nextLine ();
        System.out.println ("Length of message is:  "+message.length());
        //System.out.println ("Enter a variable");
        System.out.println ("Enter a variable");
        //Tell the user how long their message was
        String variable = s.nextLine ();
        System.out.println ("Length of message is:  "+variable.length());
        //Ask the user how many characters they want to remove from the front of the message
        System.out.println ("How many characters would you like to remove from the front of your message?");
        //Create a variable and store the users input into that variable
        int variable2 = s.nextInt ();
        //Tell the user what the new message is
        System.out.println ("Great!! The message without the first " +variable2+ " characters is: " +message.substring (variable2));
        //For example, if they enter 4, your program should say: 
        //"The message without the first 4 characters is " and then the shortened message
        //Ask the user how many characters they want to remove from the back of the message
        System.out.println ("Very cool! How many characters would you like to remove from the back of the message? "); 
        //Create a variable and store the users input into that variable
        int variable3 = s.nextInt ();
        //Tell the user what the new message is, with characters removed from both the front and the back.
        System.out.println ("Great!! The message without the last " +variable3+ " characters is: " +message.substring (variable2,message.length()-variable3));
        //fyi - this last one is a little more challenging
        //Ask the user to enter a letter that occurs in the message
        System.out.println ("Please enter a letter you see in the message ");
        //Create a variable and store the users input into that variable
        char message2 = s.next() .charAt(0);
        //Tell the user when that character first appears in the message
        System.out.println ("The first occurence of the letter "+message2+  " is at index:  "+message.indexOf(message2));
        //Finished with more time?
        //https://docs.oracle.com/javase/8/docs/api/java/lang/String.html
        //Ctrl-F "replace" and check out the fun replace methods
        //Play with them
    }
}

