import java.util.Scanner;

public class app90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = new String("welcome");
        System.out.println("nhap xau");
        str = sc.nextLine();
        char[] arr = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            System.out.println(arr[i]);
        }

        sc.close();
    }
}
