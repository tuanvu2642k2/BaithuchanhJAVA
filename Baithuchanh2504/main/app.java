package main;

import model.FulltimeEmployee;
import model.OfflineStudent;
import model.OnlineStudent;
import model.PartimeEmployee;
import model.Student;
import model.realtaxi;
import model.tiger;

public class app {
    public static void main(String[] args) {
        Student p1 = new OfflineStudent();
        OnlineStudent p2 = new OnlineStudent();
        PartimeEmployee p3 = new PartimeEmployee();
        FulltimeEmployee p4 = new FulltimeEmployee();
        tiger a1 = new tiger();
        realtaxi t1 = new realtaxi();

        p1.an();
        p2.thihocki();
        p4.thamngan();
        p3.nhanluong();
        System.out.println(p3.taisan);
        a1.eat();
        t1.turnleft();

    }
}
