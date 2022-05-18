package arrays;

import java.util.Arrays;

public class Mdarr {
    public static void main(String[] args) {
        int [][] mda= {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        //Method 1
//        for (int row = 0; row < mda.length; row++) { //mda.length gives us the number of elements present in mda[]
//            for (int col = 0; col < mda[row].length; col++) { //mda[row].length gives us the no of elements present in mda[row][col]
//                System.out.print(mda[row][col] + " ");
//            }
//            System.out.println();
//        }
        //Method 2
//        for (int row = 0; row < mda.length; row++) {
//            System.out.println(Arrays.toString(mda[row]));
//        }
    }
}
