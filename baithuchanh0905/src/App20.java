package src;

import java.util.ArrayList;

public class App20 {
    public static void main(String[] args) {
        ArrayList<Double> arr = new ArrayList<>();
        System.out.println(arr.isEmpty());
        System.out.println(arr.size());
        arr.add(3.14);
        arr.add(6969d);
        System.out.println(arr.size());
        System.out.println(arr.isEmpty());
        arr.remove(3.14);
        arr.remove(6969d);
        System.out.println(arr.isEmpty());
    }
}
