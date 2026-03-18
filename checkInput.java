
import java.util.Scanner;

public class checkInput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        char inp = input.next().charAt(0); 

        if ('A' <= inp && inp <= 'Z' || 'a' <= inp && inp <= 'z') {
            System.out.println("You entered a alphabet.");
        } else if ('0' <= inp && inp <= '9') {
            System.out.println("You entered a digit.");
        } else {
            System.out.println("You entered a special character.");
        }
        input.close();
    }
}

