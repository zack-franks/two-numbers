import java.util.Scanner;

public class twonumbers {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("welcome");	
		
		System.out.println("please enter the first number: ");
		int number1 = sc.nextInt();
		
		System.out.println("please enter a seconed number: ");
		int number2 = sc.nextInt();	
		
		int sum = number1 + number2; 
		
		System.out.println("the sum of the two numbers : "+sum);
		
        int product = number1 * number2; 
		
		System.out.println("the product of the two numbers : "+product);
		
		System.out.println(Math.max(number1, number2)+ " Is the max numer");
		
		System.out.println(Math.min(number1, number2)+ " Is the min numer");
	}
	
}
