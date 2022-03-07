import java.util.Scanner;

public class app81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so dong");
        int n = sc.nextInt();
        System.out.println("nhap so cot");
        int m = sc.nextInt();
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("nhap phan tu thu [" + i + "] [" + j + "]");
                arr[i][j] = sc.nextInt();
            }
        }
        int maxx = arr[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] > maxx)
                    maxx = arr[i][j];
            }
        }
        System.out.println("phan tu lon nhat: " + maxx);

        sc.close();
    }
}
