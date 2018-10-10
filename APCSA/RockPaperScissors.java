import java.util.Scanner;
public class RockPaperScissors {
    public static void main(String[] arg) {
        int wins = 0;
        int loses = 0;
        int ties = 0;
        String r = "rock";
        String p = "paper";
        String s = "scissors";
        r = r.toLowerCase();
        p = p.toLowerCase();
        s = s.toLowerCase();
        String computerChoice; // using String computerChoice = String.valueOf(computer); is redundant just need to make a string
        Scanner scan = new Scanner(System.in);
        boolean b = true;
        while (b) {
            System.out.println("You're playing rock, paper, scissors against the computer. Please enter your choice of rock, paper, or scissors, or type exit to quit."); // u put this outside the while loop, it needs to be in it so it can prompt the user again.
            String rps = scan.nextLine();
            int computer = (int) (Math.random() * 2 + 0); //generates an int number from 0 to 2 (makes life easier)
            if (rps.equals("exit")) {
                System.out.println("You have " + wins + " wins, you have " + loses + " loses, and you have tied " + ties + " games."); // you had this two times, you only need one if statement for exit. 
                b = false;
            }
            if (computer == 0) {
                computerChoice = r;  // if its r then computer choices rock, defined up there
            } else if (computer == 1) {
                computerChoice = p;
            } else {
                computerChoice = s;
            }
            if (rps.equals(computerChoice)) {  // never use == to compare strings. use .equals()
                System.out.println("It is a draw!");
                ties = ties + 1;

            }
            if (((rps.equals(r) && computerChoice.equals(p)))) {
                System.out.println("You lost! Computer chose paper.");
                loses = loses + 1;

            }
            if (((rps.equals(r) && computerChoice.equals(s)))) {
                System.out.println("You won! Computer chose scissors.");
                wins = wins + 1;


            }
            if (((rps.equals(p) && computerChoice.equals(s)))) {
                System.out.println("You lost! Computer chose scissors.");
                loses = loses + 1;

            }
            if (((rps.equals(p) && computerChoice.equals(r)))) {
                System.out.println("You won! Computer chose rock.");
                wins = wins + 1;

            }
            if (((rps.equals(s) && computerChoice.equals(p)))) {
                System.out.println("You won! Computer chose paper.");
                wins = wins + 1;

            }
            if (((rps.equals(s) && computerChoice.equals(r)))) {
                System.out.println("You lost! Computer chose rock.");
                loses = loses + 1;

            }
        }
    }
}
