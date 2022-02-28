import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a");
        int a = sc.nextInt();
        if (a <= 1) {
            System.out.println(a + "khong phai so nguyen to");
            sc.close();
            return;
        }
        for (int i = 2; i <= a / 2; i++) {
            if (a % i == 0) {
                System.out.println(a + " khong phai so nguyen to");
                sc.close();
                return;
            }
        }
        System.out.println(a + " la so nguyen to");
        sc.close();
    }
}
