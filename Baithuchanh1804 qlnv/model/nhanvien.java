package model;

import java.util.Scanner;

public class nhanvien {
    Scanner sc = new Scanner(System.in);
    static final int luongcoban = 10000000;
    static final int luonglamthem = 800000;
    static final int luongparttime = 100000;
    String tennv = new String("Ten nv");
    public long luong = 0;

    public void nhapthongtin() {
        System.out.println("nhap ten nhan vien: ");
        this.tennv = sc.nextLine();
        System.out.println(this.tennv);
    }

}
