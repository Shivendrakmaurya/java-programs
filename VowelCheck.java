import java.util.Scanner;

public class VowelCheck {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char alpha;
        System.out.print("Enter an alphabet = ");
        alpha = input.next().charAt(0);

        switch (alpha) {

            // Lowercase vowels
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':

            // Uppercase vowels
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':

                System.out.println(alpha + " is a vowel");
                break;

            default:
                System.out.println(alpha + " is a consonant");
        }

        input.close();
    }
}
