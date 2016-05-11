import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int value;
		
		do {
			System.out.println("Enter a number; when you enter a 5 I will stop.");
			value = Integer.parseInt(input.nextLine());
			
		} while (value !=5);
		input.close();
		System.out.println("Thanks for the 5.");
	}
	
}
