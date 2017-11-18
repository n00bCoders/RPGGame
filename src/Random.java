import java.util.concurrent.ThreadLocalRandom;

public class Random {

    public static double RInt(double min, double max){
        double random = (int)ThreadLocalRandom.current().nextDouble(min, max + 1);

        return random;
    }
}
