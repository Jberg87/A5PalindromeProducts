import java.util.Scanner;


public class AssignmentRun {

	public static void main(String[] args) {
		System.out.println("Give size of numbers: ");
		Scanner input = new Scanner(System.in);
		int numberMultiplier = input.nextInt();
		
		PalindromeCreator palindromeCreator = new PalindromeCreator();
		palindromeCreator.longestFind(numberMultiplier);

	}

}
