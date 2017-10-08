import java.util.Arrays;

/**
 * Created by Anthony on 09/25/2017.
 */

public class CombSort implements ISort{

    public void sort(int data[]) {

        long timeout= System.nanoTime();
        int n = data.length;
        int gap = n;

        boolean swapped = true;

        while (gap != 1 || swapped == true) {
            gap = getNextGap(gap);
            swapped = false;

            for (int i = 0; i < n - gap; i++) {
                if (data[i] > data[i + gap]) {
                    int temp = data[i];
                    data[i] = data[i + gap];
                    data[i + gap] = temp;

                    swapped = true;
                }
            }
        }

        timeout = System.nanoTime() - timeout;
        System.out.format("Nanoseconds for CombSort: %10d %n", timeout);
    }
    private int getNextGap(int gap) {
        gap = (gap*10)/13;
        if (gap < 1)
            return 1;
        return gap;
    }
}
