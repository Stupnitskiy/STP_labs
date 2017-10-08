import java.util.Arrays;

/**
 * Created by Anthony on 09/25/2017.
 */

public class StandartSort implements ISort{

    public void sort(int[] data ){
        long timeout= System.nanoTime();

        Arrays.sort(data);

        timeout = System.nanoTime() - timeout;
        System.out.format("Nanoseconds for Standart Sort: %10d %n", timeout);
    }
}
