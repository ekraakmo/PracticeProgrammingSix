package kraakmo.learninghowtojava.practiceprogrammingsix;

import java.util.Random;

public class MaybeItLovesMe {
    public static void main(String[] args) {

        Random petalGenerator = new Random();
        int petals = petalGenerator.nextInt(76)+13;
        int evenOrNot = 0;
        String lovesMeOrNot = "";


        System.out.println("Well here goes nothing...");

        while (evenOrNot < petals){
            if(evenOrNot % 2 == 0) {
                lovesMeOrNot = "It LOVES me!";
                System.out.println(lovesMeOrNot);
            }else {
                lovesMeOrNot = "It loves me NOT!";
                System.out.println(lovesMeOrNot);
            }
            evenOrNot ++;
        }

        if(lovesMeOrNot.equals("It loves me NOT!")) {
        System.out.println("Awww, bummer!");
        } else {
            System.out.println("Oh, wow! It really LOVES me!");
        }
    }
}
