import java.util.Random;
import java.util.Scanner;

public class Lab2_part2 {
    public static void main(String[] args) {
        int[][] matrix;
        int tempData = 0;
        Random rand = new Random();
        Scanner in = new Scanner(System.in,"utf-8");

        System.out.println("������� ������ �������");
        tempData = in.nextInt();

        matrix = new int[tempData][tempData];

        for (int i = 0; i < tempData; i++) {
            for (int j = 0; j < tempData; j++) {
                matrix[i][j] = rand.nextInt(99);
            }
        }

        for (int i = 0; i < tempData; i++) {
            for (int j = 0; j < tempData; j++) {
                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.print("\n");
        }

        evenRow(matrix);
        monotonusRow(matrix);
    }

    static void evenRow(int[][] matrix) {
        boolean isPaired = true;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if(matrix[i][j]%2 != 0){
                    isPaired = false;
                    break;
                }
            }
            if(isPaired){
                System.out.printf("������ � ������� ����������: %d\n", i+1);
            }
            isPaired = true;
        }
    }
    static void monotonusRow(int[][] matrix) {
        boolean upperMonotone = true;
        boolean downMonotone = true;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length - 1; j++) {
                if(matrix[i][j] > matrix[i][j+1]){
                    upperMonotone = false;
                }
                if(matrix[i][j] < matrix[i][j+1]){
                    downMonotone = false;
                }
            }
            if(downMonotone){
                System.out.printf("������ ��������� ������������� �������������������: %d\n", i+1);
            }
            if(upperMonotone){
                System.out.printf("������ ��������� �������� �������������������: %d\n", i+1);
            }
            downMonotone = true;
            upperMonotone = true;
        }
    }
}
