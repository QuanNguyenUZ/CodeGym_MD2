package lesson2;
import java.util.Scanner;
public class Hien_thi_20_SoNto {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Bạn muốn hiển thị bao nhiêu số nguyên tố đầu tiên? ");
            int numbers = scanner.nextInt();
            int count = 0;
            int N = 2;
            System.out.println(numbers + " số nguyên tố đầu tiên là:");
            while (count < numbers) {

                if (isPrime(N)) {
                    System.out.print(N + " ");
                    count++;
                }
                N++;
            }
            scanner.close();
        }
        public static boolean isPrime(int num) {
            if (num < 2) {
                return false;
            }

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

