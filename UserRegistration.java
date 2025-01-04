import java.util.Scanner;

public class UserRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for username
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        // Validate username
        if (username.isEmpty()) {
            System.out.println("Username cannot be empty.");
            return;
        }

        // Prompt for password
        System.out.print("Enter password (at least 6 characters): ");
        String password = scanner.nextLine();

        // Validate password
        if (password.length() < 6) {
            System.out.println("Password must be at least 6 characters long.");
            return;
        }

        // Prompt for contact number
        System.out.print("Enter contact number: ");
        String contactNumber = scanner.nextLine();

        // Validate contact number (check if it's numeric)
        if (!contactNumber.matches("[0-9]+")) {
            System.out.println("Contact number must be numeric.");
            return;
        }

        // Display the collected information
        System.out.println("\nRegistration Successful!");
        System.out.println("Username: " + username);
        System.out.println("Contact Number: " + contactNumber);

        scanner.close();
    }
}
