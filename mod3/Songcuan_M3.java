// Ryan Songcuan
// 11/7/21
// Module 3 Assignment
// The purpose of this program is to play Rock, Paper, Scissors using the random number generator.
package M3;

import java.util.Scanner;

public class Songcuan_M3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

	int computer = 1 + (int)(Math.random() * 3);

	System.out.println("Let's play Rock, Paper, Scissors!");
	System.out.println("Please make your selection by typing one of the numbers below.");
	System.out.print("Rock = 1, Paper = 2, Scissors = 3: ");
	int user = input.nextInt();

	System.out.print("The computer selected ");
	switch (computer) {
            case 1: System.out.print("rock.");
                    break;
            case 2: System.out.print("paper.");
                    break;
            case 3: System.out.print("scissors.");
	}

	System.out.print(" You selected ");
	switch (user) {
            case 1: System.out.print("rock");
                    break;
            case 2: System.out.print("paper");
                    break;
            case 3: System.out.print("scissors");
	}

	if (computer == user) {
		System.out.println(" too. It's a draw!");
        }
        else {
		boolean win = (user == 3 && computer == 2) ||
                        (user == 1 && computer == 3) || 
			(user == 2 && computer == 1);
		if (win)
			System.out.println(". You won!");
		else
			System.out.println(". You lose!");
	}
    }
}
