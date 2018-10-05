import java.util.Scanner;
public class Application {
	public static void main(String[] args) {
		
		// create scanner object
		Scanner input = new Scanner(System.in);
		
		//output the prompt
		System.out.println("Enter a Line of text: ");
		
		//wait for the user to input a line
		String line = input.nextLine();
		 //int value = input.nextInt();
		//double value=input.nextDouble();
		
		// tell them what they say
		System.out.println("You Entered Line  "+ line);
	}
}