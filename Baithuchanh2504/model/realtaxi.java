package model;

public class realtaxi implements car {
    @Override
    public void turnleft() {
        System.out.println("taxi re trai");

    }

    @Override
    public void turnright() {
        System.out.println("taxi re phai");
    }

    @Override
    public void reverse() {
        System.out.println("taxi di lui");

    }

    @Override
    public void stop() {
        System.out.println("taxi dung lai");

    }

    @Override
    public void move() {
        System.out.println("taxi di chuyen");
    }
}
