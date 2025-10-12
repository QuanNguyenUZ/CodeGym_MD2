package Method;
import java.util.Scanner;
import java.util.Arrays;
public class Tong_cac_so_o_mot_cot {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("--- BƯỚC 1: TÍNH TỔNG TRÊN MẢNG CÓ SẴN ---");
        double[][] presetMatrix={{1.5,2.0,3.5,4.0},{5.1,6.2,7.3,8.4},{9.0,10.1,11.2,12.3}};
        printMatrix(presetMatrix);
        System.out.print("Nhập thứ tự cột muốn tính tổng (0 đến "+(presetMatrix[0].length-1)+"): ");
        int columnIndexPreset=scanner.nextInt();
        calculateAndPrintSum(presetMatrix,columnIndexPreset);
        System.out.println("\n------------------------------------------------------");
        System.out.println("--- BƯỚC 2: TÍNH TỔNG TRÊN MẢNG NHẬP TỪ NGƯỜI DÙNG ---");
        System.out.print("Nhập số hàng (rows): ");
        int rows=scanner.nextInt();
        System.out.print("Nhập số cột (cols): ");
        int cols=scanner.nextInt();
        double[][] userMatrix=new double[rows][cols];
        System.out.println("Vui lòng nhập các giá trị cho ma trận:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.printf("Nhập phần tử [%d][%d]: ",i,j);
                userMatrix[i][j]=scanner.nextDouble();
            }
        }
        System.out.println("\nMa trận bạn đã nhập:");
        printMatrix(userMatrix);
        if(cols==0){
            System.out.println("Ma trận không có cột nào để tính tổng.");
        }else{
            System.out.print("Nhập thứ tự cột muốn tính tổng (0 đến "+(cols-1)+"): ");
            int columnIndexUser=scanner.nextInt();
            calculateAndPrintSum(userMatrix,columnIndexUser);
        }
        scanner.close();
    }
    public static double getColumnSum(double[][] matrix,int colIndex){
        if(matrix.length==0||matrix[0].length<=colIndex||colIndex<0){
            return Double.NaN;
        }
        double sum=0;
        for(int i=0;i<matrix.length;i++){
            sum+=matrix[i][colIndex];
        }
        return sum;
    }
    public static void calculateAndPrintSum(double[][] matrix,int columnIndex){
        double resultSum=getColumnSum(matrix,columnIndex);
        if(Double.isNaN(resultSum)){
            System.out.println("Lỗi: Thứ tự cột "+columnIndex+" không hợp lệ.");
        }else{
            System.out.printf("Tổng các phần tử ở cột %d là: %.2f\n",columnIndex,resultSum);
        }
    }
    public static void printMatrix(double[][] matrix){
        System.out.println("Ma trận:");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.printf("%.2f\t",matrix[i][j]);
            }
            System.out.println();
        }
    }
}

