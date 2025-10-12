package Method;
import java.util.Scanner;
public class Mang2chieu_TongCacSo_o_DuongCheo {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("--- BƯỚC 1: TÍNH TỔNG ĐƯỜNG CHÉO TRÊN MẢNG CÓ SẴN ---");
        double[][] presetSquareMatrix={{1.0,2.0,3.0,4.0},{5.0,6.0,7.0,8.0},{9.0,10.0,11.0,12.0},{13.0,14.0,15.0,16.0}};
        printMatrix(presetSquareMatrix);
        double sumPreset=calculateDiagonalSum(presetSquareMatrix);
        System.out.printf("Tổng các phần tử trên đường chéo chính là: %.2f\n",sumPreset);
        System.out.println("\n------------------------------------------------------");
        System.out.println("--- BƯỚC 2: TÍNH TỔNG ĐƯỜNG CHÉO TRÊN MẢNG NHẬP TỪ NGƯỜI DÙNG ---");
        System.out.print("Nhập kích thước (N) của ma trận vuông (NxN): ");
        int n=scanner.nextInt();
        if(n<=0){
            System.out.println("Kích thước ma trận phải lớn hơn 0.");
            scanner.close();
            return;
        }
        double[][] userSquareMatrix=new double[n][n];
        System.out.println("Vui lòng nhập các giá trị cho ma trận:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.printf("Nhập phần tử [%d][%d]: ",i,j);
                userSquareMatrix[i][j]=scanner.nextDouble();
            }
        }
        System.out.println("\nMa trận bạn đã nhập:");
        printMatrix(userSquareMatrix);
        double sumUser=calculateDiagonalSum(userSquareMatrix);
        System.out.printf("Tổng các phần tử trên đường chéo chính là: %.2f\n",sumUser);
        scanner.close();
    }
    public static double calculateDiagonalSum(double[][] matrix){
        if(matrix.length==0){
            return 0.0;
        }
        double sum=0;
        int size=matrix.length;
        for(int i=0;i<size;i++){
            sum+=matrix[i][i];
        }
        return sum;
    }
    public static void printMatrix(double[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.printf("%.2f\t",matrix[i][j]);
            }
            System.out.println();
        }
    }
}
