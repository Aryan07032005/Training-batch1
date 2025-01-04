import java.util.Scanner;

public class LoginSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Predefined correct username and password
        String correctUsername = "student123";
        String correctPassword = "password123";

        String username, password;
        boolean loginSuccessful = false;

        // Using do-while loop to check the login until correct credentials are entered
        do {
            // Prompt user for login details
            System.out.print("Enter Login ID: ");
            username = scanner.nextLine();

            System.out.print("Enter Password: ");
            password = scanner.nextLine();

            // Validate if entered username and password are correct
            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                loginSuccessful = true;  // If correct, set login to successful
            } else {
                // If credentials are incorrect, show an error message
                System.out.println("Incorrect Login ID or Password. Please try again.");
            }

        } while (!loginSuccessful);  // Continue prompting if login is not successful

        // Once login is successful, show welcome message
        System.out.println("Welcome to Mallareddy University!");

        scanner.close();
    }
}
