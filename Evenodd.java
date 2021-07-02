import java.util.Scanner;

class Evenodd{
	public static void main(String args[]){
		// int x = 8;
		
		// if(x%2==0){
		// 	System.out.println("Even Number");
		// }
		// else{
		// 	System.out.println("Odd Number");
		// }


		Scanner scr = new Scanner(System.in);
		System.out.println("Enter a Number");
		int x = scr.nextInt();

		
		if(x%2==0){
			System.out.println("Even Number");
		}
		else{
			System.out.println("Odd Number");
		}


	}
}