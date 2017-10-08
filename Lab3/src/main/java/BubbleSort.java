import java.util.Arrays;

/**
 * Created by Anthony on 09/25/2017.
 */

public class BubbleSort implements ISort{

    public void sort(int[] data) {

        long timeout= System.nanoTime();
        int n = data.length;
        int temp;

        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (data[j] > data[j + 1]) {
                    temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }

        timeout = System.nanoTime() - timeout;
        System.out.format("Nanoseconds for BubbleSort: %10d %n", timeout);
    }
}
