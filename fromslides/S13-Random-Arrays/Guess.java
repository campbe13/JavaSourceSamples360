import java.util.Scanner;

/**
 * User is to guess a random number
 *
 * @author     360 section 1
 * @version    2015-03-23
 */

public class Guess
{
    public static void main (String[] args)
    {
	// mods: maximum 3 guesses  (and remove cheat)
    // mods: guess out of 3 random secret numbers (use an array)

	//variable declarations
	int secret, randGuess;
	boolean guessAgain = true;
	Scanner keyboard = new Scanner(System.in);

	// have them guess a number from 1 to 10
	// scaling-factor = max-min+1
	// (Math.random() * scaling-factor) + min
	secret  = (int)(Math.random() * 100) + 1;
	System.out.println("Cheat "+ secret);

	while (guessAgain) {
		System.out.print("Guess the secret number between 1 and 100 ");
		randGuess = keyboard.nextInt();
		if ( randGuess == secret )  {
		     System.out.println("you guessed it !!");
		     guessAgain = false;
		} else {
			 System.out.println("Try again :(");
		}
	}  // while


    } //end main method
} //end Guess class




