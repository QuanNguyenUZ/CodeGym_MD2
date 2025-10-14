package Method;
import java.util.Scanner;

public class SumColumn {
    public static void main(String[] args) {
// Bước 1: Mảng có sẵn
        double[][] matrix1 = {
                {1.5, 2.0, 3.5},
                {4.0, 5.5, 6.0},
                {7.5, 8.0, 9.5}
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập thứ tự cột cần tính tổng (cho mảng có sẵn): ");
        int column1 = scanner.nextInt();

        if (column1 >= 0 && column1 < matrix1[0].length) {
            double sum1 = 0;
            for (int i = 0; i < matrix1.length; i++) {
                sum1 += matrix1[i][column1];
            }
            System.out.println("Tổng cột " + column1 + " (mảng có sẵn): " + sum1);
        } else {
            System.out.println("Số cột không hợp lệ!");

// Bước 2:  Mảng nhập từ bàn phím
            System.out.print("\nNhập số hàng: ");
            int rows = scanner.nextInt();
            System.out.print("Nhập số cột: ");
            int cols = scanner.nextInt();
            double[][] matrix2 = new double[rows][cols];
            System.out.println("Nhập các phần tử của mảng:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print("[" + i + "][" + j + "] = ");
                    matrix2[i][j] = scanner.nextDouble();
                }
            }
            System.out.print("Nhập cột cần tính tổng (tính từ 0): ");
            int column2 = scanner.nextInt();
            if (column2 >= 0 && column2 < cols) {
                double sum2 = 0;
                for (int i = 0; i < rows; i++) {
                    sum2 += matrix2[i][column2];
                }
                System.out.println("Tổng cột " + column2 + " (mảng nhập từ bàn phím): " + sum2);
            } else {
                System.out.println("Số cột không hợp lệ!");
            }
            scanner.close();
        }
    }
}