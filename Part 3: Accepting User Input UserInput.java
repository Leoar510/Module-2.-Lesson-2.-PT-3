import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        // Creating a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompting user for input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your favorite number: ");
        int favoriteNumber = scanner.nextInt();

        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble(); // Accepting height input

        // Performing an operation on the favorite number
        int result = favoriteNumber * 2;

        // Displaying the user details
        System.out.println("\nHello, " + name + "! You are " + age + " years old.");
        System.out.println("Your height is " + height + " meters.");
        System.out.println("Your favorite number multiplied by 2 is: " + result);

        // Closing the scanner
        scanner.close();
    }
}
