package lesson2;
import java.util.Scanner;
import java.util.Arrays;
public class Gop_Mang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size1, size2;
        System.out.println("--- CHƯƠNG TRÌNH GỘP 2 MẢNG ---");
        System.out.print("Nhập kích thước Mảng 1: ");
        size1 = scanner.nextInt();
        int[] array1 = new int[size1];
        System.out.println("Nhập các giá trị cho Mảng 1:");
        for (int i = 0; i < array1.length; i++) {
            System.out.print("array1[" + i + "] = ");
            array1[i] = scanner.nextInt();
        }
        System.out.print("\nNhập kích thước Mảng 2: ");
        size2 = scanner.nextInt();
        int[] array2 = new int[size2];
        System.out.println("Nhập các giá trị cho Mảng 2:");
        for (int i = 0; i < array2.length; i++) {
            System.out.print("array2[" + i + "] = ");
            array2[i] = scanner.nextInt();
        }
        int[] array3 = new int[size1 + size2];
        int index3 = 0;
        System.out.println("\n--- THỰC HIỆN GỘP MẢNG ---");
        System.out.println("Gán Mảng 1 vào Mảng 3...");
        for (int i = 0; i < array1.length; i++) {
            array3[index3] = array1[i];
            index3++;
        }
        System.out.println("Gán Mảng 2 vào Mảng 3...");
        for (int i = 0; i < array2.length; i++) {
            array3[index3] = array2[i];
            index3++;
        }
        System.out.println("\n--- KẾT QUẢ ---");
        System.out.println("Mảng 1: " + Arrays.toString(array1));
        System.out.println("Mảng 2: " + Arrays.toString(array2));
        System.out.println("Mảng 3 (sau khi gộp): " + Arrays.toString(array3));
        scanner.close();
    }
}