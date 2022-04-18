package model;

public class fulltime extends nhanvien {
    public int chucvu = 1;
    public int lamthem = 0;

    public void datchucvu() {
        System.out.println("Dat chuc vu cho " + tennv);
        System.out.println("1: Linh;     2: Sep");
        chucvu = sc.nextInt();
        if (chucvu > 2 || chucvu < 1) {
            System.out.println("Chuc vu khong hop le. nhap lai:");
            datchucvu();
        }

    }

    public void tinhluong() {
        luong = lamthem * 800000 + luongcoban * chucvu;
        System.out.println("Luong cua nhan vien " + tennv + " la: " + luong);
    }

    public void tinhcong() {
        System.out.println("So ngay lam them cua " + tennv);
        lamthem = sc.nextInt();
        if (lamthem > 31) {
            System.out.println("So ngay lam them khong hop le. nhap lai:");
            tinhcong();
        }
    }

    public void thongtin() {
        System.out.println("\nTen nv: " + tennv);
        if (chucvu == 1)
            System.out.println("Chuc vu: Linh");
        if (chucvu == 2)
            System.out.println("Chuc vu: Sep");
        System.out.println("So ngay lam them: " + lamthem);
        System.out.println("Luong: " + luong);
    }

}
