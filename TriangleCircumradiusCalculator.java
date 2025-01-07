import java.util.Scanner;

public class TriangleCircumradiusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the sides of the triangle
        System.out.print("Enter the length of side a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the length of side b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter the length of side c: ");
        double c = scanner.nextDouble();

        // Calculate the semi-perimeter (s)
        double s = (a + b + c) / 2;

        // Calculate the area using Heron's formula
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        // Check for valid triangle (area should be > 0)
        if (area <= 0) {
            System.out.println("The sides entered do not form a valid triangle.");
        } else {
            // Calculate the circumradius (R)
            double circumradius = (a * b * c) / (4 * area);

            // Display the result
            System.out.println("The radius of the circumcircle is: " + circumradius);
        }

        // Close the scanner
        scanner.close();
    }
}


