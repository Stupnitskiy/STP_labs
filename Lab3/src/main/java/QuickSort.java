import java.util.Arrays;

/**
 * Created by Anthony on 09/25/2017.
 */

public class QuickSort implements ISort{

    public void sort(int data[]){
        long timeout= System.nanoTime();

        int low = 0;
        int high = data.length-1;

        quickSorting(data, low, high);

        timeout = System.nanoTime() - timeout;
        System.out.format("Nanoseconds for QuickSort: %10d %n", timeout);
    }
    private void quickSorting(int data[], int low, int high) {
        if (low < high)
        {
            /* pi is partitioning index, data[pi] is
              now at right place */
            int pi = partition(data, low, high);
            // Recursively sort elements before
            // partition and after partition
            quickSorting(data, low, pi - 1);
            quickSorting(data, pi + 1, high);
        }
    }
    private int partition(int data[], int low, int high) {
        int pivot = data[high];
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (data[j] <= pivot)
            {
                i++;

                // swap data[i] and data[j]
                int temp = data[i];
                data[i] = data[j];
                data[j] = temp;
            }
        }

        // swap data[i+1] and data[high] (or pivot)
        int temp = data[i+1];
        data[i+1] = data[high];
        data[high] = temp;

        return i+1;
    }
}
