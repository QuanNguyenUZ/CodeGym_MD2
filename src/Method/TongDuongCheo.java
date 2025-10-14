package Method;
import java.util.Scanner;
public class TongDuongCheo {
    public static void main(String[] args){
        double[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        double sum1 = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum1 += matrix[i][i];
        }
        System.out.println("Tổng đường chéo: (Có sẵn) " + sum1);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập kích thước ma trận vuông: ");
        int size = scanner.nextInt();
        double[][] matrix2 = new double[size][size];
        System.out.println("Nhập các phần tử:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("[" + i + "][" + j + "] = ");
                matrix2[i][j] = scanner.nextDouble();
            }
        }
        double sum2 = 0;
        for (int i = 0; i < size; i++) {
            sum2 += matrix2[i][i];
        }
        System.out.println("Tổng đường chéo (Nhập): " + sum2);
        scanner.close();
    }
}
