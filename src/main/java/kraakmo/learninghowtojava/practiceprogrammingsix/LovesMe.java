package kraakmo.learninghowtojava.practiceprogrammingsix;

public class LovesMe {
    public static void main(String[] args) {

        int petals = 34;

        System.out.println("Well here goes nothing...");

        while (petals > 0){
            if((petals % 2) != 0) {
                System.out.println("It loves me!");
                petals --;
            }else {
                System.out.println("It loves me not!");
                petals --;
            }
        }
        System.out.println("I knew it! it LOVES ME!");
    }
}
