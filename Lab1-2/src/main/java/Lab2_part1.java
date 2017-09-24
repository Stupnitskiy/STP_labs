import java.util.Scanner;

/**
 * Created by Anthony on 09/11/2017.
 */
public class Lab2_part1 {
    public static void main(String[] args) {
        int numbers[];
        int tempData = 11;
        boolean inCatch = true;
        Scanner in = new Scanner(System.in,"utf-8");

        while(inCatch) {
            try {
                System.out.println("Введите размер массива (до 10)");
                tempData = in.nextInt();
                while(tempData > 10){
                    System.out.println("Число больше 10. Введите размер массива (до 10)");
                    tempData = in.nextInt();
                }
                inCatch = false;
            }
            catch (Exception ex) {
                inCatch = true;
            }
        }


        numbers = new int[tempData];
        System.out.println("Заполните массив\n");

        for(int i = 0; i < numbers.length; i++){
            System.out.printf("Введено: %d\n", i);
            numbers[i] = in.nextInt();
        }


        pairedMean(numbers);
        minAndNumbers(numbers);
        minProduct(numbers);
        multiple5(numbers);
        pairedItemsOnOdd(numbers);
        maxSum(numbers);
    }
    static void pairedMean(int[] arrNumbers){
        int sum = 0;
        int pairs = 0;

        for(int i = 1; i < arrNumbers.length; i+=2){
            sum += arrNumbers[i];
            pairs += 1;
        }

        int result = sum/pairs;

        System.out.printf("Cреднее арифметическое парных элементов массива: %d\n", result);
    }
    static void minAndNumbers(int[] arrNumbers){
        int min = 99999;
        int sum = 0;
        int temp;

        for(int i = 0; i < arrNumbers.length; i++) {
            if(arrNumbers[i] > 0 && arrNumbers[i] < min){
                min = arrNumbers[i];
            }
        }
        sum += min;
        temp = sum;
        while(temp != 0){

            sum = sum + (temp % 10);
            temp/=10;
        }


        System.out.printf("Сумма минимального положительного элемента массива и его чисел: %d\n", sum);
    }
    static void minProduct(int[] arrNumbers)    {
        int min = arrNumbers[0];
        int minPaired = arrNumbers[1];
        int result;

        for(int i = 1; i < arrNumbers.length; i++) {
            if(arrNumbers[i] < min){
                min = arrNumbers[i];
            }
            if(i%2 == 1 && arrNumbers[i] < minPaired){
                minPaired = arrNumbers[i];
            }
        }

        result = min*minPaired;

        System.out.printf("Произведение наименьшего и наименьшего парного элементов массива: %d\n", result);
    }
    static void multiple5(int[] arrNumbers){
        int result = 0;

        for(int i = 0; i < arrNumbers.length; i++) {
            if(arrNumbers[i]%5 == 0){
                result+=1;
            }
        }

        System.out.printf("Количество элементов, кратных 5: %d\n", result);
    }
    static void pairedItemsOnOdd(int[] arrNumbers){
        int result = 0;

        for(int i = 0; i < arrNumbers.length; i+=2) {
            if(arrNumbers[i]%2 == 0){
                result+=arrNumbers[i];
            }
        }

        System.out.printf("Сумма парных элементов на нечетных позициях: %d\n", result);
    }
    static void maxSum(int[] arrNumbers){
        int max = arrNumbers[0];
        int second = arrNumbers[1];
        int result;

        for(int i = 0; i < arrNumbers.length; i++) {
            if(arrNumbers[i]>max){
                max=arrNumbers[i];
            }
        }
        for(int i = 0; i < arrNumbers.length; i++) {
            if(arrNumbers[i]>second && arrNumbers[i] != max){
                second=arrNumbers[i];
            }
        }
        result = max+second;

        System.out.printf("Сумма максимального и второго макс. элемента: %d\n", result);
    }

}
