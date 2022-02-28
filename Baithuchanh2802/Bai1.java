import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a");
        int a = sc.nextInt();
        System.out.println("nhap b");
        int b = sc.nextInt();
        while (a != b) {
            if (a > b)
                a = a - b;
            if (a < b)
                b = b - a;
        }
        System.out.println("uoc chung lon nhat la: " + a);
        sc.close();
    }
}