import java.util.Scanner;
import java.util.Random;


public class Lab6 {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int userSides;
			boolean rerun = true;
			
			
			
			System.out.println("Welcome to the Grand Circus Casino!\n");
			
			do {
				int sum = 0;
				System.out.println("How many sides should each die have? ");
				userSides = scan.nextInt();
				System.out.println("First Roll: " + generateRandomDieRoll(userSides));
				System.out.println("Second Roll: " + generateRandomDieRoll2(userSides));
				
				
				System.out.println("\nWould you like to roll again? (y/n)");
				String userRerun = scan.next();
				
				if(userRerun.equalsIgnoreCase("y")||userRerun.equalsIgnoreCase("yes")) {
					rerun = true;
				} else {
					rerun = false;
				}
			} while (rerun);
			
			System.out.println("Thank you for playing!");
			
			
			scan.close();		
		}
		
		public static int generateRandomDieRoll(int sides) {
			
			sides = (int)(Math.random() * sides + 1);
			return sides;
		}
		
		public static int generateRandomDieRoll2(int sides) {
			
			Random rand = new Random();
			sides = rand.nextInt(sides);
			return sides + 1;
			
		}
		
	}