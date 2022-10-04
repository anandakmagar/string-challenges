import java.util.InputMismatchException;
import java.util.Scanner;

public class InputCheck {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the string input");
		
		String s = scanner.next();
		
		// This will check if the entered input can be converted to the integer
		// If YES then it means that it is a number. If NOT it will look for the available matching exception
		try {
			Integer.parseInt(s);
			System.out.println("Input is a number!");
			
		}
		
		// This will catch the exception if the input cannot be converted to integer
		// it means it is not a number
		catch(NumberFormatException nfe){
			System.out.println("Input is not number!! ");
			nfe.printStackTrace();
		}

	}

}
