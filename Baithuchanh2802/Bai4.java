import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n");
        int n = sc.nextInt();
        int c;
        System.out.println("cac so nguyen to nho hon" + n + " la:");
        for (int i = 2; i < n; i++) {
            c = 1;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    c = 0;
                    break;
                }
            }
            if (c == 1)
                System.out.println(i);
        }
        sc.close();
    }
}
