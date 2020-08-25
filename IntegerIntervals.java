package assignmentOne;
import java.util.Scanner;
public class IntegerIntervals {

	public static void main(String[] args) {
		

		//Print the opening statement
		System.out.println("This program will print the next 3 odd or even numbers after the entered number");
		
		//creating an object of scanner class
		Scanner input = new Scanner(System.in);
		
		
		//obtain number from user
		System.out.print("Enter a number:");
		
		
		//declare and initialize instance variable
		double enteredNumber;
		enteredNumber = input.nextDouble();
		
		
		//creating if statement for even numbers
		if (enteredNumber % 2 == 0) {
			
			System.out.println("The next three even numbers after " +enteredNumber+ " are: ");
			System.out.println(enteredNumber +2);
			System.out.println(enteredNumber +4);
			System.out.println(enteredNumber +6);
		
		//creating else statement for odd numbers
		} else {
		
			System.out.println("The next three odd numbers after" +enteredNumber+ " are: ");
			System.out.println(enteredNumber + 2);
			System.out.println(enteredNumber + 4);
			System.out.println(enteredNumber + 6);
		}
			
			//ending scanner class
			input.close();
			
	}//end of main method

}//end of class



