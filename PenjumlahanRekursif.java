import java.util.Scanner;
public class PenjumlahanRekursif {
    static String penjumlahan(int n) {
        if (n == 1) {
            return "1";
        }
        return penjumlahan(n - 1) + " + " + n;
    }
    static int hasilPenjumlahan(int n) {
        if (n == 1) {
            return (1);
        }
        return (hasilPenjumlahan(n - 1) + n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("F = ");
        int f = sc.nextInt();
        System.out.print(penjumlahan(f) + " = ");
        System.out.println(hasilPenjumlahan(f));
    }
}
