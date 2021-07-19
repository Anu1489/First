// program to calculate the factorial of number

class WhileDemo2{
	public static void main(String[] args){
		int i = 0, fact = 1, num = 7;
		i = num;
		while(num != 0){
			fact = fact * num;
			num--;
		}
		System.out.println("The factorial of " + i + " is: " +fact);
	}
}