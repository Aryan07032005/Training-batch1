import java.util.Scanner;

public class demo {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Default credentials (for demonstration purposes)
        String storedUsername = "student";
        String storedPassword = "password123";

        // Simulate checking whether the user is logging in for the first time
        System.out.println("Welcome to Mallareddy University!");

        // Asking if user is already logged in or first-time login
        System.out.print("Have you registered before? (yes/no): ");
        String registrationStatus = scanner.nextLine();

        if (registrationStatus.equalsIgnoreCase("no")) {
            // First-time registration: Ask for username and password
            System.out.println("Please create your account.");
            System.out.print("Enter a username: ");
            String newUsername = scanner.nextLine();

            System.out.print("Enter a password: ");
            String newPassword = scanner.nextLine();

            // Here you would store the new username and password securely, 
            // but for simplicity, we just print a success message.
            System.out.println("Account created successfully!");
            System.out.println("Please log in now.");

            // Now, prompt for login after registration
            System.out.print("Enter your username: ");
            String loginUsername = scanner.nextLine();

            System.out.print("Enter your password: ");
            String loginPassword = scanner.nextLine();

            // Check if the entered login credentials match the stored ones
            if (loginUsername.equals(newUsername) && loginPassword.equals(newPassword)) {
                System.out.println("Login successful!");
                System.out.println("Welcome to Mallareddy University!");
            } else {
                System.out.println("Invalid credentials! Please try again.");
            }

        } else if (registrationStatus.equalsIgnoreCase("yes")) {
            // Login for already registered users
            System.out.println("Please log in with your credentials.");

            // Prompt for username and password
            System.out.print("Enter your username: ");
            String loginUsername = scanner.nextLine();

            System.out.print("Enter your password: ");
            String loginPassword = scanner.nextLine();

            // Verify if the entered credentials match the stored credentials
            if (loginUsername.equals(storedUsername) && loginPassword.equals(storedPassword)) {
                System.out.println("Login successful!");
                System.out.println("Welcome to Mallareddy University!");
            } else {
                System.out.println("Invalid username or password. Please try again.");
            }
        } else {
            System.out.println("Invalid input. Please enter 'yes' or 'no'.");
        }

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}