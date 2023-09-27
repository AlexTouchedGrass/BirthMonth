import java.util.Scanner;

public class BirthMonth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int month = 0;



        System.out.println("What is your birth month?");
        month = scan.nextInt();

        if(month <= 12 && month >= 1){
            System.out.println("Your birth month is " + month + ".");
        }
        else {
            System.out.println("You have entered an incorrect birth month. Please try again.");
            System.exit(0);
    }


    }
}