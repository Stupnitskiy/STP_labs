import java.util.Scanner;

/**
 * Created by Anthony on 09/11/2017.
 */
public class Lab2 {
    public static void main(String[] args) {
        int numbers[];
        int tempData;
        Scanner in = new Scanner(System.in);

        System.out.println("Введите размер массива (до 10)");
        tempData = in.nextInt();
        while(tempData > 10){
            System.out.println("Число больше 10. Введите размер массива (до 10)");
            tempData = in.nextInt();
        }
        numbers = new int[tempData];
        System.out.println("Заполните массив\n");

        for(int i = 0; i < numbers.length; i++){
            System.out.printf("Введено: %d\n", i);
            numbers[i] = in.nextInt();
        }


        PairedMean(numbers);

    }
    static int PairedMean(int[] arrNumbers){
        int sum = 0;
        int pairs = 0;

        for(int i = 0; i < arrNumbers.length; i++){
            if(arrNumbers[i]%2 == 0){
                sum += arrNumbers[i];
                pairs += 1;
            }
        }
        int result = sum/pairs;

        System.out.printf("Cреднее арифметическое парных элементов массива: %d", result);
        return result;
    }
}
