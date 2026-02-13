
import java.util.Scanner;

public class MathOperations {

    public static void main(String[] args) {

        float a, b, sum, sub, prod, div;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        a = input.nextFloat();
        b = input.nextFloat();

        sum = a + b;
        sub = a - b;
        prod = a * b;

        System.out.println("Sum = " + sum);
        System.out.println("Subtraction = " + sub);
        System.out.println("Product = " + prod);

        if (b != 0) {
            div = a / b;
            System.out.println("Division = " + div);
        } else {
            System.out.println("Division by zero is not allowed.");
        }

        input.close();
    }
}
