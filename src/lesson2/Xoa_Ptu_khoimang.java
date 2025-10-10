package lesson2;
import java.util.Scanner;
public class Xoa_Ptu_khoimang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {10, 4, 6, 7, 8, 6, 0, 0, 0, 0};
        System.out.println("Mảng ban đầu: ");
        printArray(array);
        System.out.print("Nhập phần tử cần xóa (X): ");
        int X = scanner.nextInt();
        int index_del = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == X) {
                index_del = i;
                break;
            }
        }
        if (index_del == -1) {
            System.out.println("Phần tử " + X + " không tồn tại trong mảng.");
        } else {
            System.out.println("Phần tử " + X + " được tìm thấy tại vị trí (index): " + index_del);
            for (int i = index_del; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
            array[array.length - 1] = 0;
            System.out.println("Mảng sau khi xóa phần tử " + X + ": ");
            printArray(array);
        }
        scanner.close();
    }
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

