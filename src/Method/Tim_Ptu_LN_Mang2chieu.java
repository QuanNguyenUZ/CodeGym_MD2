package Method;
import java.util.Scanner;
public class Tim_Ptu_LN_Mang2chieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số hàng (n): ");
        int n = sc.nextInt();
        System.out.print("Nhập số cột (m): ");
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        System.out.println("--- Nhập giá trị cho ma trận ---");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.printf("Nhập phần tử [%d][%d]: ", i, j);
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("\n--- Ma trận đã nhập ---");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        int max = matrix[0][0];
        int maxRow = 0;
        int maxCol = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(matrix[i][j] > max){
                    max = matrix[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }
        System.out.println("\n--- KẾT QUẢ ---");
        System.out.println("Giá trị lớn nhất (Max) là: " + max);
        System.out.printf("Tại tọa độ: [%d][%d]\n", maxRow, maxCol);
        sc.close();
    }
}