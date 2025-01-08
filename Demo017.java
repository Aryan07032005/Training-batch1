public class Demo017 {
    public static void main(String[] args) {
        int number = 99; // Replace with any number
        int sum = sumOfDigits(number);
        System.out.println("The sum of the digits of " + number + " is: " + sum);
    }

    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10; // Add the last digit to sum
            num /= 10; // Remove the last digit
        }
        return sum;
    }
}