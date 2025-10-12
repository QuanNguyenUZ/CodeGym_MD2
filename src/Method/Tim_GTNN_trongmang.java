package Method;
import java.util.Scanner;
import java.util.Arrays;
public class Tim_GTNN_trongmang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int SIZE;
        System.out.println("Tìm giá trị nhỏ nhất trong mảng");
        System.out.print("Nhập kích thước mảng (SIZE): ");
        if (scanner.hasNextInt()) {
            SIZE = scanner.nextInt();
        } else {
            System.out.println("Lỗi: Kích thước mảng không hợp lệ.");
            scanner.close();
            return;
        }
        if (SIZE <= 0) {
            System.out.println("Kích thước mảng phải lớn hơn 0.");
            scanner.close();
            return;
        }
        int[] arr = new int[SIZE];
        System.out.println("Nhập các giá trị cho các phần tử trong mảng:");
        for (int i = 0; i < SIZE; i++) {
            System.out.print("Phần tử [" + i + "] = ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("\nMảng đã nhập: " + Arrays.toString(arr));
        int min = arr[0];
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        System.out.println("\n--- KẾT QUẢ ---");
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + min);
        System.out.println("Nó nằm ở vị trí (index): " + minIndex);
        scanner.close();
    }
}
