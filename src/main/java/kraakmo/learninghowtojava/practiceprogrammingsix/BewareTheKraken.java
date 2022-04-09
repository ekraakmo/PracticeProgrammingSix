package kraakmo.learninghowtojava.practiceprogrammingsix;

import java.util.Scanner;

public class BewareTheKraken {
    public static void main(String[] args) {

        System.out.println("Already, get those flippers and wetsuit on - we're going diving!");
        System.out.println("here we gooooOOOooOOOoooo....!!!! *SPLASH*");

        int depthDivedInFt = 0;
        Scanner input = new Scanner(System.in);

        while (depthDivedInFt < 36200){
            System.out.println("So far, we've swam " + depthDivedInFt + " feet");

            if (depthDivedInFt == 5000) {
                System.out.println("Oh wow it's a dolphin!");
            }else if (depthDivedInFt == 10000) {
                System.out.println("That blue whale is huge!!!");
            } else if (depthDivedInFt == 15000) {
                System.out.println("I can barely see that angler fish...");
            }else if (depthDivedInFt >= 20000) {
                System.out.println("Uhhh, I think I see the Kraken, guys...");
                System.out.println("TIME TO GO!");
                break;
            }

            System.out.println("Do you want to keep swimming? (y/n)");
            String answer = input.nextLine();

            if (answer.equals("y")) {
                depthDivedInFt += 2500;
            } else {
                break;
            }
        }
        System.out.println("");
        System.out.println("We ended up swimming " + depthDivedInFt + " feet down.");
        System.out.println("I bet we can do better next time!");
    }
}
