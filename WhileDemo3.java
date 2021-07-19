// Write program to find the sum of postive numbers


import java.util.Scanner;

class WhileDemo3{
	public static void main(String[] args){

		int sum = 0;

		// create an object of scanner class

		Scanner input = new Scanner(System.in);
		

		// take integer input from the user 
		System.out.println("Enter a Number");
		int number = input.nextInt();

		//while loop continues 
		// until entered number is positive 
		while (number >= 0){
			sum += number;

		System.out.println("Enter a Number");
		number = input.nextInt();
		}

		System.out.println("sum = " +sum);
		input.close();
	}
}