
import java.util.Scanner;

public class math_operation {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter a number =");
            int n = input.nextInt();
            int result = n * n;
            System.out.println("The square of the number is = " + result);
            input.close();
        }
    }
}
