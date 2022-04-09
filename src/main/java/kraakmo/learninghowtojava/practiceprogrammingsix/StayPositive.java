package kraakmo.learninghowtojava.practiceprogrammingsix;

import java.util.Scanner;

public class StayPositive {
    public static void main(String[] args) {

        int countdown;
        int constant;

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a number you want to countdown from: ");
        countdown = userInput.nextInt();

        constant = countdown;

        while (countdown > 0) {
            System.out.print(countdown + " ");
            countdown --;
            if (countdown == (constant-10)){
                System.out.println("");
                constant -= 10;
            }
        }
    }
}