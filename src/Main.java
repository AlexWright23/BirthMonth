import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your birth month (1-12): ");

        int birthMonth = scanner.nextInt();

        if (birthMonth >= 1 && birthMonth <= 12) {
        System.out.println("Your birth month is: " + birthMonth);
        }
        else {
        System.out.println("You have entered an invalid month, please try again. " + birthMonth);
     }
    }
}