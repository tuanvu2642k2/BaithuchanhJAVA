import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n");
        long n = sc.nextLong();
        long sum = 0L;
        for (long i = 1; i <= n / 2; i++) {
            if (n % i == 0)
                sum += i;
        }
        if (sum == n)
            System.out.println(n + " la so hoan thien");
        else
            System.out.println(n + " khong phai so hoan thien");
        sc.close();
    }
}
