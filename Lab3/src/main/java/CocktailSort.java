import java.util.Arrays;

/**
 * Created by Anthony on 09/25/2017.
 */

public class CocktailSort implements ISort{

    public void sort(int[] data ){
        long timeout= System.nanoTime();

        boolean swapped;
        do {
            swapped = false;
            for (int i =0; i<=  data.length  - 2;i++) {
                if (data[ i ] > data[ i + 1 ]) {
                    int temp = data[i];
                    data[i] = data[i+1];
                    data[i+1]=temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
            swapped = false;
            for (int i= data.length - 2;i>=0;i--) {
                if (data[ i ] > data[ i + 1 ]) {
                    int temp = data[i];
                    data[i] = data[i+1];
                    data[i+1]=temp;
                    swapped = true;
                }
            }
        } while (swapped);

        timeout = System.nanoTime() - timeout;
        System.out.format("Nanoseconds for CocktailSort: %10d %n", timeout);
    }
}
