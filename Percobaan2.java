import java.util.Scanner;
public class Percobaan2 {
    static int hitungPangkat(int x, int y) {
        if (y == 0) {
            return (1);
        } else {
            return (x *hitungPangkat(x, y - 1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bilangan, pangkat;
        System.out.print("Masukkan bilangan yang dihitung : ");
        bilangan = sc.nextInt();
        System.out.print("Pangkat : ");
        pangkat = sc.nextInt();
        System.out.println(hitungPangkat(bilangan, pangkat));
        for (int i = pangkat; i >= 1; i--) {
            System.out.print(bilangan + "x");
        }
        System.out.print("1 = " + hitungPangkat(bilangan, pangkat));
    }
}
