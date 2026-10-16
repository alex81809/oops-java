import java.util.Scanner;

public class reverse_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a three-digit number with decreasing digits: ");
        int originalNumber = sc.nextInt();

        // Reverse the digits of the original number
        int reversedNumber = 0;
        int temp = originalNumber;
        while (temp > 0) {
            reversedNumber = reversedNumber * 10 + temp % 10;
            temp /= 10;
        }

        // Subtract the reversed number from the original number
        int result = originalNumber - reversedNumber;

        // Reverse the result
        int reversedResult = 0;
        temp = result;
        while (temp > 0) {
            reversedResult = reversedResult * 10 + temp % 10;
            temp /= 10;
        }

        // Add the result to its reverse
        int finalResult = result + reversedResult;

        System.out.println("Original Number: " + originalNumber);
        System.out.println("Reversed Number: " + reversedNumber);
        System.out.println("Result after subtraction: " + result);
        System.out.println("Reversed Result: " + reversedResult);
        System.out.println("Final Result after addition: " + finalResult);
    }
}
