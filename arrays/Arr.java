package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Arr {
    public static void main(String[] args) {
        int[] rollNo = {1, 2, 3};
        for (int i = 0; i < 3; i++) {
            System.out.print(rollNo[i] + " ");

        }
        for (int i : rollNo) {
            System.out.print(i + " ");

        }
        System.out.println(Arrays.toString(rollNo));
    }
}
