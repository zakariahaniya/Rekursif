public class DeretDescendingRekursif {
    static int deretRekursif(int n) {
        if (n == 0) {
            return (0);
        }
        System.out.print(n + " ");
        return deretRekursif(n - 1);
    }
    static int deretInteratif(int n) {
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
        return (0);
    }
    public static void main(String[] args) {
        System.out.println(deretRekursif(5));
        System.out.println(deretInteratif(5));
    }
}
