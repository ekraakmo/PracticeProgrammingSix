package kraakmo.learninghowtojava.practiceprogrammingsix;

import java.util.Random;

public class LazyTeenager {
    public static void main(String[] args) {

        Random chance = new Random();

        int numberOfTimesToldToCleanRoom = 1;
        boolean roomIsClean = false;
        int percentChance = 5;

        do{
            System.out.println("Clean your Room!! (x" + numberOfTimesToldToCleanRoom + ")");
            int chanceToCleanRoom = chance.nextInt(100)+1;
            if (chanceToCleanRoom <= percentChance){
                roomIsClean = true;
                System.out.println("FINE! I'LL CLEAN MY ROOM. BUT I REFUSE TO EAT MY PEAS.");
            }else {
                numberOfTimesToldToCleanRoom++;
                percentChance +=5;
            }
            if (numberOfTimesToldToCleanRoom == 16){
                System.out.println("YOU'RE GROUNDED! NO XBOX FOR 2 WEEKS!");
                break;
            }
        } while (!roomIsClean);
    }
}
