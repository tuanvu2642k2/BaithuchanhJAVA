package model;

public class parttime extends nhanvien {

    public int lamthem = 0;

    public void tinhluong() {
        luong = lamthem * 100000;
        System.out.println("luong cua nhan vien " + tennv + " la: " + luong);
    }

    public void tinhcong() {
        System.out.println("so gio them cua " + tennv);
        lamthem = sc.nextInt();
        if (lamthem >= 744) {
            System.out.println("So gio lam them khong hop le. nhap lai:");
            tinhcong();
        }
    }

    public void thongtin() {
        System.out.println("\nTen nv: " + tennv);
        System.out.println("Nhan vien parttime");
        System.out.println("So gio lam them: " + lamthem);
        System.out.println("Luong: " + luong);
    }

}
