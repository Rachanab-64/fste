package Activities;
import java.util.Scanner;

public class Activity10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Player 1, enter rock, paper, or scissors: ");
        String player1 = scanner.nextLine().toLowerCase();

        System.out.print("Player 2, enter rock, paper, or scissors: ");
        String player2 = scanner.nextLine().toLowerCase();

    
        if (player1.equals(player2)) {
            System.out.println("It's a Tie!");
        }
       
        else if (
            (player1.equals("rock") && player2.equals("scissors")) ||
            (player1.equals("scissors") && player2.equals("paper")) ||
            (player1.equals("paper") && player2.equals("rock"))
        ) {
            System.out.println("Player 1 Wins!");
        }
       
        else {
            System.out.println("Player 2 Wins!");
        }

        scanner.close();
    }
}