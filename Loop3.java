
class Loop3 {
	public static void main(String args[]){
		int i, sum;
		for (i = 1, sum = 0; i <= 10; i++){
			System.out.println("The value of i is: "+i);
			sum = sum + i;
		}
		System.out.println("The sum of 10 number is: " +sum);
	}
}