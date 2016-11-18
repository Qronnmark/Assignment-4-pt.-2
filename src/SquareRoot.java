/**
 * 
 */

/**
 * @author Q.Ronnmark
 *Name: Quenton Ronnmark
 *Mr. Hardman
 *Assignment 4 part 2
 *Nov. 16th 2016
 */
import java.util.Scanner;

public class SquareRoot {
	/**
	 * @param args
	 */
	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
	
		double userNum;
		
		do {
			System.out.println("Please enter a number: ");
			userNum = userInput.nextDouble();
			if(userNum < 0 ){
				System.out.println("Error. Please enter a Positive number.");
			
			}
			
		}while(userNum < 0);
		
		System.out.println(Math.sqrt(userNum));

		userInput.close();
	 
	}
}
	