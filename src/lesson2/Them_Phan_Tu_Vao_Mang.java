package lesson2;
import java.util.Scanner;
import java.util.Arrays;
public class Them_Phan_Tu_Vao_Mang {
    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 8, 9, 3, 0, 0, 0};
        Scanner sc = new Scanner(System.in);
        int currentSize = 6;
        System.out.println("--- CHÈN PHẦN TỬ VÀO MẢNG ĐƠN GIẢN ---");
        System.out.println("Mảng ban đầu: " + Arrays.toString(arr));
        System.out.println("Số phần tử đang sử dụng: " + currentSize);
        System.out.println("----------------------------------------");
        System.out.print("Nhập phần tử cần chèn (X): ");
        int x = sc.nextInt();
        System.out.print("Nhập vị trí muốn chèn (index 0 đến " + (arr.length - 1) + "): ");
        int addIndex = sc.nextInt();
        if (addIndex < 0 || addIndex >= arr.length) {
            System.out.println("Lỗi: Vị trí chèn không hợp lệ. Không thể chèn.");
        } else if (currentSize >= arr.length) {
            System.out.println("Lỗi: Mảng đã đầy. Không thể chèn.");
        } else {
            for (int i = currentSize; i > addIndex; i--) {
                arr[i] = arr[i - 1];
            }
            arr[addIndex] = x;
            currentSize++;
            System.out.println("Chèn thành công!");
        }
        System.out.println("----------------------------------------");
        System.out.print("Mảng sau khi chèn: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println("\nSố phần tử đang sử dụng mới: " + currentSize);
        sc.close();
    }
}