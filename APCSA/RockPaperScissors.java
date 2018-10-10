import java.util.Scanner;
public class RockPaperScissors {
    public static void main(String[] arg) {
        int i = 0;
        int wins = 0;
        int loses = 0;
        int ties = 0;
        String r = "rock";
        String p = "paper";
        String s = "scissors";
        r = r.toLowerCase();
        p = p.toLowerCase();
        s = s.toLowerCase();
        String[] object = {"rock", "paper", "scissors"}; 
        Scanner scan = new Scanner (System.in);
        System.out.println("You're playing rock, paper, scissors against the computer. Please enter your choice of rock, paper, or scissors, or type exit to quit.");
        String rps = scan.nextLine();
        boolean b = true;
        while (b) {
            if (rps == "exit") {    
                b = false;
                System.out.println ("You have " +wins+ " wins, you have " +loses+ " loses, and you have tied " +ties+ " games.");  
                break;
            }
            double computer = Math.random() * 2 + 1; //random function. generates a number between 0 and 1
            String computerChoice = String.valueOf(computer);
            if (computer == 1) {
                computerChoice = "rock"; 
            }
            else if (computer == 2) {
                computerChoice = "paper"; 
            }
            else {
                computerChoice = "scissors"; 
            }
            if (rps == ("exit")) {
                System.out.println ("You have " +wins+ " wins, you have " +loses+ " loses, and you have tied " +ties+ " games.");      
                b = false;
            }
            if (rps == computerChoice) {
                System.out.println ("It is a draw!");
                ties = ties + 1;
            }
            if (((rps.equals(r) && computerChoice.equals(p)))) {
                System.out.println ("You lost! Computer chose paper.");
                loses = loses + 1;
            }
            if (((rps.equals(r) && computerChoice.equals(s)))) {
                System.out.println ("You won! Computer chose scissors.");
                wins = wins + 1;
            }
            if (((rps.equals(p) && computerChoice.equals(s)))) {
                System.out.println ("You lost! Computer chose scissors.");
                loses = loses + 1;  
            }
            if (((rps.equals(p) && computerChoice.equals(r)))) {
                System.out.println ("You won! Computer chose rock.");
                wins = wins + 1;
            }
            if (((rps.equals(s) && computerChoice.equals(p)))) {
                System.out.println ("You won! Computer chose paper.");
                wins = wins + 1;
            }
            if (((rps.equals(s) && computerChoice.equals(r)))) {
                System.out.println ("You lost! Computer chose rock.");
                loses = loses + 1;  
            }
        }
    }
}
