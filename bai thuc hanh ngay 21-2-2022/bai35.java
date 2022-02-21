import java.util.Scanner;

public class bai35 {

    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        int min = a < b ? a : b;
        System.out.println(min);
        sc.close();
    }
}