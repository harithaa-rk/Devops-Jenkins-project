// Importing Scanner for user input
import java.util.Scanner;

public class BasicJavaProgram {
    public static void main(String[] args) {
        // Printing a message to the console
        System.out.println("Welcome to Java Programming!");

        // Creating a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Asking for user input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Displaying a personalized message
        System.out.println("Hello, " + name + "! Have a great day learning Java!");

        // Closing the scanner
        scanner.close();
    }
}
