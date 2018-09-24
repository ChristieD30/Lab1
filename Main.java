package lab1;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numOne = 0;
		int numTwo = 0; 
		int hundreds = 0;
		int tens = 0;
		int ones =0;
		int hundreds2 = 0;
		int tens2 = 0;
		int ones2 =0;
		int hundreds3 = 0;
		int tens3 = 0;
		int ones3 = 0;
		
		//Promt user to enter the first number
		System.out.println("We are going to compare two number with three digits.");
		System.out.println("Please enter the first number.");
		numOne = input.nextInt();
		System.out.println(numOne);
		
		//Error message if number has more or less than three digits.
		if (numOne >= 1000) {
			System.out.println("Error! Number has too many digits");
		}
		 if (numOne <= 99) {
			System.out.println("Error! Number has too few digits");
		}
		 
			
		//Going to figure out the digits for numOne
        hundreds = numOne % 10;
        numOne /= 10;
        tens = numOne % 10;
        numOne /= 10;
        ones = numOne % 10;

		
		//Promt user to input second value
		System.out.println("Please enter the second number.");
		numTwo = input.nextInt();
		System.out.println(numTwo);
		
		
		//Going to figure out the digits for numTwo
		 hundreds2 = numTwo % 10;
	        numTwo /= 10;
	        tens2 = numTwo % 10;
	        numTwo /= 10;
	        ones2 = numTwo % 10;
        
        hundreds3 = hundreds + hundreds2;
        tens3 = tens + tens2;
        ones3 = ones +ones2;
        		
        		
       
        if (hundreds3 == tens3) {
        	System.out.println("True");
        }
        else if (tens3 == ones3) {
        	System.out.println("True");
        }
        else if (ones3 == hundreds3) {
        	
        	System.out.println("True");
        }
        else {
        	System.out.println("False");
        }
		
		input.close();
	
		
		
	
		
		
		

	}

}
