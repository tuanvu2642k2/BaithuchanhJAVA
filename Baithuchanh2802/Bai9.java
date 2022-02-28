import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n");
        int n = sc.nextInt();
        while (n != 0) {
            System.out.print(n % 10);
            n /= 10;
        }
        sc.close();
    }
}
