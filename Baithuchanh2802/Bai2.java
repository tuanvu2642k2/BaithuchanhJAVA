import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("nhap canh a");
        double a = sc.nextDouble();
        System.out.println("nhap canh b");
        double b = sc.nextDouble();
        System.out.println("nhap canh c");
        double c = sc.nextDouble();
        if (a == b && b == c) {
            System.out.println("tam giac can");
        } else if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
            if (a == b || a == c || b == c)
                System.out.println("tam giac vuong can");
            else
                System.out.println("tam giac vuong");
        } else if (a == b || a == c || b == c)
            System.out.println("tam giac can");
        else
            System.out.println("tam giac thuong");
        sc.close();
    }
}
