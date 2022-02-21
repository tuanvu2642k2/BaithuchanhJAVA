import java.util.Scanner;

public class bai47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int c = 0;
        int sum = 0;
        do {
            n = sc.nextInt();
            sum = sum + n;
            c++;
        } while (sum <= 100);
        System.out.println("ban vua nhap " + c + " so");
        System.out.println("co tong la: " + sum);

        sc.close();
    }
}
