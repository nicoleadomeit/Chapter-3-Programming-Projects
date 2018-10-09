import java.util.Scanner;
public class RockPaperScissors {
    public static void main(String[] arg) {
        int i = 0;
        while (i == 0) 
        {   String userInput = ("You're playing rock, paper, scissors against the computer.");
            if (userInput== "rock") {
                i=1;
            } //escapes loop
            else if (userInput == "paper") {
                i=1;
            } //escapes loop
            else if (userInput == "scissors") {
                i=1;
            } //escapes loop
            else {
                System.out.println ("Try again.");
            } //alerts, loops back to start
            int wins = 0;
            int loses = 0;
            int ties = 0;
            boolean t = true;
            boolean f = true;
            String r = "rock";
            String p = "paper";
            String s = "scissors";
            r = r.toLowerCase();
            p = p.toLowerCase();
            s = s.toLowerCase();
            String[] object = {"rock", "paper", "scissors"}; 
            Scanner scan = new Scanner (System.in);
            System.out.println("Please enter your choice of rock, paper, or scissors?");
            String rpc = scan.nextLine();

            double computer = Math.random(); //random function. generates a number between 0 and 1
            String computerChoice = String.valueOf(computer);
            if (computerChoice >= 0 <= .33) {
                computerChoice = "rock"; 
            }
            else if (computerChoice <= .66) {
                computerChoice = "paper"; 
            }
            else {
                computerChoice = "scissors"; 
            }
            if (rpc == ("exit")) {
                f = false;
                System.out.println ("You have " +wins+ " wins, you have " +loses+ " loses, and you have tied " +ties+ " games.");      
            }
            if (rpc == computerChoice) {
                System.out.println ("It is a draw!");
                ties = ties + 1;
            }
            if (((rpc.equals(r) && computerChoice.equals(p)))) {
                System.out.println ("You lost!");
                loses = loses + 1;
            }
            if (((rpc.equals(r) && computerChoice.equals(s)))) {
                System.out.println ("You won!");
                wins = wins + 1;
            }
            if (((rpc.equals(p) && computerChoice.equals(s)))) {
                System.out.println ("You lost!");
                loses = loses + 1;  
            }
            if (((rpc.equals(p) && computerChoice.equals(r)))) {
                System.out.println ("You won!");
                wins = wins + 1;
            }
            if (((rpc.equals(s) && computerChoice.equals(p)))) {
                System.out.println ("You won!");
                wins = wins + 1;
            }
            if (((rpc.equals(s) && computerChoice.equals(r)))) {
                System.out.println ("You lost!");
                loses = loses + 1;  
            }
        }
    }
}
