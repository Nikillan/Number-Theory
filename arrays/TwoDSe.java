package arrays;

import java.util.Arrays;

public class TwoDSe {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int[] ans = sea(arr, 4);
        System.out.println(Arrays.toString(ans));

    }
    public static int[] sea(int[][] inarr, int ele)
    {
        int row;
        int col;
        int[] fin = new int[2];
        for(row = 0; row < inarr.length; row += 1)
            for(col = 0; col < inarr[row].length; col += 1)
            {
                if(inarr[row][col] == ele)
                {
                    return new int[]{row + 1, col + 1};
                }
            }
        return null;
    }
}
