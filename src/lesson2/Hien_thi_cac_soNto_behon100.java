package lesson2;

public class Hien_thi_cac_soNto_behon100 {
        public static void main(String[] args) {
            System.out.println("Các số nguyên tố nhỏ hơn 100 là:");
            for (int i = 2; i < 100; i++) {
                if (isPrime(i)) {
                    System.out.print(i + " ");
                }
            }
        }
        public static boolean isPrime(int num) {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
