package Algorithm_Solutions.exercises_2;
import java.util.Scanner;
public class Multiples{
	
	public static void main (String... args){
		
		System.out.println("Enter First Number");
		
		Scanner input = new Scanner (System.in);
		
		int num1 = input.nextInt();
		
		System.out.println ("Enter Second Number");
		
		int num2 = input.nextInt();
		
		if (num1%num2 == 0) {
			System.out.printf("%d is a multiple of %d",num1,num2);
		}
		
		else {
			System.out.printf("%d is not a multiple of %d",num1,num2);
		}
	
	}

}