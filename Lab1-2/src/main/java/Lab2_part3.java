import java.util.Random;
import java.util.Scanner;

public class Lab2_part3 {
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrix[i][j] = rand.nextInt(99)-50;
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.print("\n");
        }
        System.out.print("\n");

        analyseRow(matrix);
    }

    static void analyseRow(int[][] matrix) {
        int sum = 0;
        int max;

        for (int i = 0; i < matrix.length; i++) {
            if(matrix[i][i] < 0){
                for (int j = 0; j < matrix.length; j++) {
                    sum += matrix[i][j];
                }

                max = matrix[i][0];
                for (int j = 0; j < matrix.length; j++) {
                    if(matrix[i][j] > max){
                        max = matrix[i][j];
                    }
                }
                System.out.printf("Строка %d, сумма: %d, максимальный элемент: %d\n", i+1, sum, max);
            }
        }
    }
}
