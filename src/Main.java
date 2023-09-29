import java.util.Scanner;

//Class birthMonth
//        main()
//        num = 1-12
//        output "Please enter your birth month (1-12) "
//        input birthMonth
//        if birthMonth >= 1 AND birthMonth <=12 then
//        output "Your birth month is " birthMonth
//        else
//        output "You entered an inccrrect month value: N "
//        return
//        endClass

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