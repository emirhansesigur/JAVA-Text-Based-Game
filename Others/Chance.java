package Others;

import java.util.Random;

public class Chance {

    private static int number;

    public static int getNumber() { // it is used in order to update RestHitNumber
                                    // if if number is equal to 3 Weak Knight is lucky and
                                    // WeakKnight will be able to kill Strong Knight
        number = (int)(Math.random()*3+1);
        return number;
    }

    public static boolean Luck() {
        int temp=(int)(Math.random()*3);

        if(temp==0){ // %33 unlucky
            // if temp is equal to 0 it means String Knight is unluck and connot kill neither strong nor weak
            return false;
        }
        return true;

    }

}
