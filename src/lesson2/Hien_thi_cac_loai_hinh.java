package lesson2;

import java.util.Scanner;

public class Hien_thi_cac_loai_hinh {
    public static void main(String[] args) {
        // LỖI ĐÃ XẢY RA: Đối tượng Scanner được khai báo là 'input',
        // nhưng các lệnh gọi lại dùng 'scanner' (chữ thường).
        // KHẮC PHỤC: Thay 'scanner' bằng 'input'.
        Scanner input = new Scanner(System.in);

        // =========================================================
        // 1. VẼ HÌNH CHỮ NHẬT (RECTANGLE)
        // =========================================================
        System.out.println("--- VẼ HÌNH CHỮ NHẬT ---");
        System.out.print("Nhập chiều cao (height) hình chữ nhật: ");
        int rectHeight = input.nextInt(); // Đã sửa
        System.out.print("Nhập chiều rộng (width) hình chữ nhật: ");
        int rectWidth = input.nextInt(); // Đã sửa
        System.out.println("Kết quả:");

        for (int i = 0; i < rectHeight; i++) {
            for (int j = 0; j < rectWidth; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // =========================================================
        // 2. VẼ TAM GIÁC VUÔNG GÓC DƯỚI TRÁI (BOTTOM-LEFT)
        // =========================================================
        System.out.println("\n----------------------------------------");
        System.out.println("--- VẼ TAM GIÁC VUÔNG GÓC DƯỚI TRÁI (Bottom-Left) ---");
        System.out.print("Nhập chiều cao (height) tam giác: ");
        int triHeightBL = input.nextInt(); // Đã sửa
        System.out.println("Kết quả:");

        for (int i = 1; i <= triHeightBL; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // =========================================================
        // 3. VẼ TAM GIÁC VUÔNG GÓC TRÊN TRÁI (TOP-LEFT)
        // =========================================================
        System.out.println("\n----------------------------------------");
        System.out.println("--- VẼ TAM GIÁC VUÔNG GÓC TRÊN TRÁI (Top-Left) ---");
        System.out.print("Nhập chiều cao (height) tam giác: ");
        int triHeightTL = input.nextInt(); // Đã sửa
        System.out.println("Kết quả:");

        for (int i = triHeightTL; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // =========================================================
        // 4. VẼ TAM GIÁC VUÔNG GÓC DƯỚI PHẢI (BOTTOM-RIGHT) - THÊM
        // =========================================================
        System.out.println("\n----------------------------------------");
        System.out.println("--- VẼ TAM GIÁC VUÔNG GÓC DƯỚI PHẢI (Bottom-Right) ---");
        System.out.print("Nhập chiều cao (height) tam giác: ");
        int triHeightBR = input.nextInt();
        System.out.println("Kết quả:");

        for (int i = 1; i <= triHeightBR; i++) {
            // Vòng lặp in khoảng trắng
            for (int j = 1; j <= triHeightBR - i; j++) {
                System.out.print("  ");
            }
            // Vòng lặp in *
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // =========================================================
        // 5. VẼ TAM GIÁC CÂN (ISOSCELES TRIANGLE) - THÊM
        // =========================================================
        System.out.println("\n----------------------------------------");
        System.out.println("--- VẼ TAM GIÁC CÂN (Isosceles Triangle) ---");
        System.out.print("Nhập chiều cao tam giác cân: ");
        int isoHeight = input.nextInt();
        System.out.println("Kết quả:");

        for (int i = 1; i <= isoHeight; i++) {
            // 1. In khoảng trắng để căn giữa
            for (int j = 1; j <= isoHeight - i; j++) {
                System.out.print(" ");
            }
            // 2. In ký tự * (2*i - 1 lần)
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Đóng đối tượng Scanner
        input.close();
    }
}