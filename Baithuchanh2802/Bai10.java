import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n");
        int n = sc.nextInt();
        int sum = 0;
        while (n != 0) {
            n /= 10;
            sum += 1;
        }
        System.out.print(sum);
        sc.close();
    }
}
