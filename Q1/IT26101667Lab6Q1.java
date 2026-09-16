import java.util.Scanner;
public class IT26101667Lab6Q1{
	
	public static void main(String[] args){
	
	//create a scanner object to read input
	Scanner input = new Scanner(System.in);
	
	//Declare the variables
	double number,square,squareRoot;
	
	//prompt the user to enter a number
	System.out.println("Enter a number: ");
	number = input.nextDouble();
	
	// validations 
	if (number <= 0){
		System.out.println("Error : The number must be greater than zero");
	}
	else{
		//calcuating square
		square = Math.pow(number , 2); 
	
		//calcuating square root
		squareRoot = Math.sqrt (number);
		
		//Display square & square root
		System.out.println("");
		System.out.println("The square of "+number+" is :"+square);
		System.out.println("The square root of "+number+" is :"+squareRoot);
	}
	}
}