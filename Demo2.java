import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        // Define correct username and password
        String correctUsername = "user001";
        String correctPassword = "password";
        
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to enter username
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        
        // Prompt user to enter password
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        
        // Check if username and password are correct
        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password.");
        }
        
        // Close the scanner
        scanner.close();
    }
}
