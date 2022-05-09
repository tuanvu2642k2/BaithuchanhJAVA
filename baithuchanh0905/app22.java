import java.util.ArrayList;
import java.util.Scanner;

public class app22 {
    public static void main(String[] args) {
        ArrayList<Integer> arrl = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n, max;

        System.out.println("nhap so phan tu");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("arrl [" + i + "] ");
            arrl.add(sc.nextInt());
        }

        max = arrl.get(0);

        for (int i = 1; i < n; i++) {
            if (arrl.get(i) > max) {
                max = arrl.get(i);
            }
        }

        System.out.println("ptu lon nhat: " + max);
        sc.close();
    }
}
