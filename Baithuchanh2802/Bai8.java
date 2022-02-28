import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = -1;
        while (1 < 2)

        {
            System.out.println("nhap n");
            long n = sc.nextLong();
            if (a < n && n % 5 == 0)
                a = n;
            if (n == 0) {
                if (a != -1)
                    System.out.println("so lon nhat chia het cho 5 la " + a);
                else
                    System.out.println("khong co so chia het cho 5");
                sc.close();
                return;
            }
        }
    }
}