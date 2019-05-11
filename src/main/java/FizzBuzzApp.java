import java.util.Scanner;

public class FizzBuzzApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in);
		FizzBuzz fizzBuzzObject = new FizzBuzz();
		
		System.out.println("Enter a number:");
		int number = input.nextInt();
		
		System.out.println(fizzBuzzObject.getResponse(number));
		
		input.close();
		
	}

}
