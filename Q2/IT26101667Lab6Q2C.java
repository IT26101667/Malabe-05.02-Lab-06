import java.util.Scanner;
public class IT26101667Lab6Q2C{
	
	public static void main(String[] args){
	
	//declaring variables
	int num1,num2,num3,num4,num5,num6,num7,num8,num9,num10;
	int sum = 0;
	double average;
	
	//create a scanner object to read input
	Scanner input = new Scanner(System.in);
	
	//read 10 inputs from reader
	System.out.println("Enter a number 1 : ");
	num1 = input.nextInt();
	sum += num1;
		
	System.out.println("Enter a number 2 : ");
	num2 = input.nextInt();
	sum += num2;
	
	System.out.println("Enter a number 3 : ");
	num3 = input.nextInt();
	sum += num3;
	
	System.out.println("Enter a number 4 : ");
	num4 = input.nextInt();
	sum += num4;
	
	System.out.println("Enter a number 5 : ");
	num5 = input.nextInt();
	sum += num5;
	
	System.out.println("Enter a number 6 : ");
	num6 = input.nextInt();
	sum += num6;
	
	System.out.println("Enter a number 7 : ");
	num7 = input.nextInt();
	sum += num7;
	
	System.out.println("Enter a number 8 : ");
	num8 = input.nextInt();
	sum += num8;
	
	System.out.println("Enter a number 9 : ");
	num9 = input.nextInt();
	sum += num9;
	
	System.out.println("Enter a number 10 : ");
	num10 = input.nextInt();
	sum += num10;
	
	average = sum / 10.0;
	
	System.out.println(" ");
	System.out.println("The numbers you entered are : ");
	System.out.print(num1+" ");
	System.out.print(num2+" ");
	System.out.print(num3+" ");
	System.out.print(num4+" ");
	System.out.print(num5+" ");
	System.out.print(num6+" ");
	System.out.print(num7+" ");
	System.out.print(num8+" ");
	System.out.print(num9+" ");
	System.out.println(num10+" ");	
	
	System.out.println();
	System.out.println("Sum of the numbers : "+sum);
	System.out.println("Average of the numbers : "+average);
	
		
		
	}	
}