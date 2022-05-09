import java.util.Scanner;

public class giaiphuongtrinh {
    public static void main(String[] args) {
        double a, b, c, x1, x2, delta;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap a (a # 0): ");
        a = scanner.nextDouble();
        System.out.print("Nhap b: ");
        b = scanner.nextDouble();
        System.out.print("Nhap c: ");
        c = scanner.nextDouble();
        System.out.println("Phuong trinh bac 2 vua nhap co dang: " + a + "x^2 + " + b + "x + " + c + " = 0");
        delta = Math.pow(b, 2) - 4 * a * c;
        if (delta < 0) {
            System.out.println("Phuong trinh vo nghiem!");
        } else if (delta == 0) {
            x1 = -b / (2 * a);
            System.out.println("Phuong trinh co nghiem kep x1 = x2 = " + x1);
        } else {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phuong trinh co hai nghiem x1 = " + x1 + " và x2 = " + x2);
        }
        scanner.close();
    }
}