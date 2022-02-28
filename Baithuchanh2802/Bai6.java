import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        System.out.println("nhap n");
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println("cac so hoan hao nho hon " + n + " la:");
        long[] a = { 6, 28, 496, 8128, 33550336, 859869056 };
        for (int i = 0; i <= 5; i++) {
            if (n >= a[i])
                System.out.println(a[i]);
        }
        sc.close();

    }
}
