package Additional;

import Game.Postac;

import java.util.concurrent.ThreadLocalRandom;

public class Random {

    public static double RInt(double min, double max){
        double random = (int)ThreadLocalRandom.current().nextDouble(min, max + 1);

        return random;
    }

    public static boolean Cryt(){

        int R = 100;
        int C = (int) Postac.getCrit();
        int[] tablica = new int[R];
        int[] tablica1 = new int[C];

        for(int b = 1; b < R; b++){
            tablica[b] = b+1;
        }

        for(int b = 1; b < C; b++){
            tablica1[b] = b+1;
        }

        int x = (int)RInt(1, tablica.length);

        if(x <= C){
            return true;  // BIJESZ Z KRYTA JAK POJEBANY

        }else{
            return false;  // ZNACZY ŻE KRYT NIE SIADNOŁ

        }

    }
}
