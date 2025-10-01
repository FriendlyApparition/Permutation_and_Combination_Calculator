package permutation_combination;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		String userChoice = null;
		String userN = null;
		String userR = null;
		String goAgain = null;
		
		int n = 0;
		int r = 0;
		Scanner scanner = new Scanner(System.in);
		boolean appOn = true;
		boolean calcDone = true;
		boolean whatsN = true;
		boolean whatsR = true;
		do {
			System.out.println("Would you like to do permutation or combination? (type p for permutation type c for combination type): ");
			
			while(true) {
				userChoice = scanner.nextLine().trim();
				if (userChoice.equalsIgnoreCase("permutation") || userChoice.equalsIgnoreCase("p")) {
					break;
				} else if (userChoice.equalsIgnoreCase("combination") || userChoice.equalsIgnoreCase("c") ) {
					break;
				  } else {
					  System.out.println("Please input permutation(p) or combination(c)");
				    }
				}
			System.out.println("What would you like n to be?: ");
			while (whatsN) {
				userN = scanner.nextLine();
				try {
					n = Integer.parseInt(userN);
				}
				catch (NumberFormatException e) {
					System.out.println("Input must be an integer for n.");
					continue;
				}
				if (n > -1) {
					break;
				} else {
					System.out.println("n cannot be negative.");
				  }		
			}
			System.out.println("What would you like r to be?: ");
			while (whatsR) {
				userR = scanner.nextLine();
				try {
					r = Integer.parseInt(userR);
				}
				catch (NumberFormatException e) {
					System.out.println("Input must be an integer for r.");
					continue;
				}
				if ((r < n) & (r > -1)) {
					break;
				} else if (r > n) {
					System.out.println("r cannot be bigger than n.");
					continue;
				  } else if (r < 0) {
					  System.out.println("r cannot be negative.");
					  continue;
				  	}
			}
			
			if (userChoice.equalsIgnoreCase("permutation") || userChoice.equalsIgnoreCase("p")) {
				System.out.println(String.format("Calculated permutation: %d",Permutation.permutationFormula(n, r)));
				
			}
			else {
				System.out.println(String.format("Calculated Combination: %d",Combination.combinationFormula(n, r)));
			}
			System.out.println("Would you like to make a new calculation? Yes or No:");
			while (calcDone) {
				
				goAgain = scanner.nextLine().trim();
				if (goAgain.equalsIgnoreCase("yes")) {
					calcDone = false;
				} else if (goAgain.equalsIgnoreCase("no")) {
					appOn = false;
					calcDone = false;
				}
				
				
			}
		} while (appOn);
		System.out.println("Thank you for using my app");
		scanner.close();
	}
}
