import java.util.Scanner;

public class PairProcess {
	public static void main(String[] args) {
		int num1, num2, sum;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print( "First Number? :" );
		num1 = keyboard.nextInt();
		
		System.out.print( "Last Number?  :" );
		num2 = keyboard.nextInt();
		
		sum = num1+num2;
		if(sum>200)
		System.out.println("Sum = "+sum +"*");
		else
			System.out.println("Sum = "+sum);
		System.out.println("Product = "+num1*num2);
		System.out.println("Average = "+(num1+num2)/2);
		
		keyboard.close();
	}
}