
// This program finds the largest of three numbers entered by the user.
import java.util.Scanner;

public class findLargest {

    public static void main(String[] args) {
        int a, b, c;

        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        // Find the largest number among a, b, and c
        if (a >= b && a >= c) {
            System.out.println("Largest number is: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("Largest number is: " + b);
        } else {
            System.out.println("Largest number is: " + c);
        }
        input.close();
    }
}
