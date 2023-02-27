import java.util.Scanner;
public class slide30 {
    private static Scanner scanner = new Scanner(System.in);
    public static int DEC_10 = 10;
    public static void main(String[] args) {
        System.out.print("nhap so n = ");
        int n = scanner.nextInt();
        System.out.printf("tong cua cac chu so "
                + "cua %d la: %d", n, tongcacchuso(n));
    }
    public static int tongcacchuso(int n) {
        int total = 0;
        do {
            total = total + n % DEC_10;
            n = n / DEC_10;
        } while (n > 0);
        return total;
    }
}