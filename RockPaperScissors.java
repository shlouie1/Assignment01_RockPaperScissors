import java.util.Scanner;
import java.lang.String;

public class RockPaperScissors {
	public static void main (String[] args) {

		//init scanner object and variables
		Scanner userInput = new Scanner(System.in);
		String user1Input = "";
		String user2Input = "";
		String trash = "";

		String userAsk = "";
		boolean programDone = false;


		//do while for continuing or not continuing 
		do {

			//ask users their move
			do {
				System.out.print("You're user 1: What's your move?(R, P, S): ");

				if (userInput.hasNextLine()) {
					user1Input = userInput.nextLine();
				}
					if (!(user1Input.equalsIgnoreCase("r") || user1Input.equalsIgnoreCase("p") || user1Input.equalsIgnoreCase("s"))) {
						trash = user1Input;
						System.out.println("Invalid input. Can't use: " + trash);
					}
					
				
			} while (! (user1Input.equalsIgnoreCase("r") || user1Input.equalsIgnoreCase("p") || user1Input.equalsIgnoreCase("s")));

			do {
				System.out.print("You're user 2: What's your move?(R, P, S): ");

				if (userInput.hasNextLine()) {
					user2Input = userInput.nextLine();
				}
					if (!(user2Input.equalsIgnoreCase("r") || user2Input.equalsIgnoreCase("p") || user2Input.equalsIgnoreCase("s"))) {
						trash = user2Input;
						System.out.println("Invalid input. Can't use: " + trash);
					}
					
				
			} while (! (user2Input.equalsIgnoreCase("r") || user2Input.equalsIgnoreCase("p") || user2Input.equalsIgnoreCase("s")));


			//logic for 
			if (user1Input.equalsIgnoreCase(user2Input)) {
				if (user1Input.equalsIgnoreCase("r")) {
					System.out.println("Rock vs Rock. Tie!");
				}
				if (user1Input.equalsIgnoreCase("p")) {
					System.out.println("Rock vs Rock. Tie!");
				}
				else {  //(user1Input == "s") 
					System.out.println("Scissors vs Scissors. Tie!");
				}
			}
			else {
				if (user1Input.equalsIgnoreCase("r") && user2Input.equalsIgnoreCase("p")) {
					System.out.println("Rock gets covered by paper. Player 2 wins!");
				}
				else if (user1Input.equalsIgnoreCase("r") && user2Input.equalsIgnoreCase("s")) {
					System.out.println("Rock breaks scissors. Player 1 wins!");
				}
				else if (user1Input.equalsIgnoreCase("p") && user2Input.equalsIgnoreCase("r")) {
					System.out.println("Paper covers rock. Player 1 wins!");
				}
				else if (user1Input.equalsIgnoreCase("p") && user2Input.equalsIgnoreCase("s")) {
					System.out.println("Paper gets cut by scissors. Player 2 wins!");
				}
				else if (user1Input.equalsIgnoreCase("s") && user2Input.equalsIgnoreCase("r")) {
					System.out.println("Scissors cuts paper. Player 1 wins!");
				}
				else //(user1Input == "s" && user2Input == "r")
					{
					System.out.println("Scissors gets broken by rock. Player 2 wins!");
				}

				System.out.print("Would you like to play again?(Y for yes): ");
				userAsk=userInput.nextLine();

				if (!userAsk.equalsIgnoreCase("y")) {
					programDone = true;
				}

			}
		} while (!programDone);
	}
}