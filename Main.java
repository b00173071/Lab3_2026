import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	    Scanner keyboard = new Scanner(System.in);
	    StackReferenceBased stack = new StackReferenceBased();
	    
	    System.out.println("Is the list empty?: " + stack.isEmpty());
	    stack.push("bread");
	    stack.push("orange");
	    stack.push("54");
		
	    System.out.println("Balanced: " + stack.isBalanced("{word}"));
	    System.out.println("Unbalanced: " + stack.isBalanced("{word"));
		stack.displayStack();
		

	    int choice = 0;

	    while (choice != 6) {

	        System.out.println("\nWelcome to StackTest! Please select a number from the list.");
	        System.out.println("1. Push a string on to the stack");
	        System.out.println("2. Pop a string from the stack");
	        System.out.println("3. Peek at the top of the stack");
	        System.out.println("4. Empty the stack");
	        System.out.println("5. Check if a string has balanced brackets");
	        System.out.println("6. Quit the program");

	        choice = keyboard.nextInt();
	        keyboard.nextLine();

	        switch (choice) {

	            case 1:
	        }
	    } 
	}
}
