package main;

import model.fulltime;
import model.parttime;

//import may cai kia vao
public class app79 {
    public static void main(String[] args) {

        fulltime nv1 = new fulltime();
        nv1.nhapthongtin();
        nv1.datchucvu();
        nv1.tinhcong();
        nv1.tinhluong();

        parttime nv2 = new parttime();
        nv2.nhapthongtin();
        nv2.tinhcong();
        nv2.tinhluong();

        nv1.thongtin();
        nv2.thongtin();
    }
}