package Method;
import java.util.Scanner;
public class Dem_so_lan_xuat_hien_trong_chuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String mainString = "programming in java is fun and challenging";
        System.out.println("--- ĐẾM SỐ LẦN XUẤT HIỆN CỦA KÝ TỰ ---");
        System.out.println("Chuỗi cho trước: \"" + mainString + "\"");
        System.out.print("Nhập ký tự bạn muốn đếm: ");
        char targetChar;
        String inputLine = scanner.nextLine();
        if (inputLine.length() > 0) {
            targetChar = inputLine.charAt(0);
        } else {
            System.out.println("Bạn chưa nhập ký tự nào.");
            scanner.close();
            return;
        }
        int count = 0;
        int length = mainString.length();
        for (int i = 0; i < length; i++) {
            char currentChar = mainString.charAt(i);
            if (currentChar == targetChar) {
                count++;
            }
        }
        System.out.println("\n--- KẾT QUẢ ---");
        System.out.printf("Ký tự '%c' xuất hiện %d lần trong chuỗi.\n", targetChar, count);
        scanner.close();
    }
}
