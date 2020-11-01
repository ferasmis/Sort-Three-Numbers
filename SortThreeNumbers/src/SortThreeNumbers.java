/***************************************************************************
* Name: Feras
* Description: This program is designed to sort numbers in increasing order
 *************************************************************************/

//import
import java.util.Scanner;

public class SortThreeNumbers {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in); // Create Scanner

        // Prompt the user to enter three numbers
        System.out.print("Enter three numbers: ");
	double n1 = input.nextDouble(); //store user input as double
	double n2 = input.nextDouble();
	double n3 = input.nextDouble();

        // Display numbers in increasing order using value method
	sortedNumbers(n1, n2, n3);
    }//end main

	//sortedNumbers Method displays three numbers in increasing order
	public static void sortedNumbers(
		double num1, double num2, double num3) {
                // Hold number to swap
		double swap; 
		
             //if statement to check which no. is bigger than num2 and swap it
		if (num2 < num1 && num2 < num3){
			swap = num1;
			num1 = num2;
			num2 = swap;
		}//end if
             //elseif statement to check which no. is bigger than num3 swap them
		else if (num3 < num1 && num3 < num2) {
			swap = num1; 
			num1 = num3;
			num3 = swap;
		}//end else if
             //check whether num3 is less then num2 swap them
                else if (num3 < num2) {
			swap = num2;
			num2 = num3;
			num3 = swap;
		}//end if
		
		// Display result to the user in increasing order
		System.out.println(num1 + " " + num2 + " " + num3);
		
	}// end method
}// end class
