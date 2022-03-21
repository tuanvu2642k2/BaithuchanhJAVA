import java.util.Scanner;

public class ht {
    public static void main(String[] args) {

        hinhtron ht = new hinhtron();
        ht.nhapbankinh();
        ht.tinhchuvi();
        ht.inchuvi();

    }

}

class hinhtron {
    final float pi = 3.14f;
    float bankinh;
    float chuvi;
    float dientich;

    void nhapbankinh() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ban kinh: ");
        bankinh = sc.nextFloat();
        sc.close();
    }

    void tinhchuvi() {
        chuvi = 2 * pi * bankinh;
    }

    void inchuvi() {
        System.out.println("chu vi la" + chuvi);
    }
}