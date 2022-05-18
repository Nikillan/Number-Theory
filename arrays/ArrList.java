package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(10);
//        list.add(510);
//        list.add(101);
//        list.add(20);
//        list.add(105);
//        list.add(140);
//        list.add(30);
//        list.add(101);
//        list.add(20);
//        list.add(105);
//        list.add(140);
//        list.add(30);
//        list.add(140);
//        list.add(30);
//        list.add(101);
//        list.add(20);
//        list.add(105);
//        list.add(140);
//        list.add(30);
//        System.out.println(list);
        Scanner inp = new Scanner(System.in);

        System.out.println(list.contains(1234));
        for (int i = 0; i < 10; i++) {
            list.add(inp.nextInt());
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(list.get(i));
        }

    }
}
