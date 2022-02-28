import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;
        System.out.println("nhap n");
        double n = sc.nextDouble();
        a = n;
        if (n == 0) {
            System.out.println("so lon nhat la " + a);
            sc.close();
            return;
        }
        while (1 < 2) {
            System.out.println("nhap n");
            n = sc.nextDouble();
            if (a < n)
                a = n;
            if (n == 0) {
                System.out.println("so lon nhat la " + a);
                sc.close();
                return;
            }
        }

    }
}
