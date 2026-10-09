import java.util.Scanner;

public class Main {

    public static boolean isBalanced(String s) {

        StackReferenceBased stack = new StackReferenceBased();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == '{') {
                stack.push("{");
            }
            else if (ch == '}') {

                if (stack.isEmpty()) {
                    return false;
                }

                try {
                    stack.pop();
                }
                catch (StackException e) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        StackReferenceBased stack = new StackReferenceBased();

        int choice = 0;

        while (choice != 6) {

            System.out.println("\nWelcome to StackTest!");
            System.out.println("Please select a number from the list.");
            System.out.println("1. Push a string on to the stack");
            System.out.println("2. Pop a string from the stack");
            System.out.println("3. Peek at the top of the stack");
            System.out.println("4. Empty the stack");
            System.out.println("5. Check if a string has balanced brackets");
            System.out.println("6. Quit the program");

            System.out.print("Choice: ");
            choice = keyboard.nextInt();
            keyboard.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter a string to push: ");
                    String item = keyboard.nextLine();

                    stack.push(item);

                    System.out.println(item + " pushed onto stack.");
                    stack.displayStack();
                    break;

                case 2:

                	System.out.println("Removed: " + stack.pop());
              
                    stack.displayStack();
                    break;

                case 3:
                	System.out.println("Top item: " + stack.peek());

                    stack.displayStack();
                    break;

                case 4:
                    stack.popAll();

                    System.out.println("Stack emptied.");

                    stack.displayStack();
                    break;

                case 5:

                    System.out.print("Enter a string: ");
                    String Stringer = keyboard.nextLine();

                    if (isBalanced(Stringer)) {
                        System.out.println("Brackets are balanced.");
                    }
                    else {
                        System.out.println("Brackets are NOT balanced.");
                    }

                    stack.displayStack();
                    break;

                case 6:

                    System.out.println("Goodbye!");
                    break;

                default:

                    System.out.println("Invalid choice.");
            }
        }

        keyboard.close();
    }
}
