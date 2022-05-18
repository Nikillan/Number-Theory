package Recursion;

import java.util.Arrays;

public class SelectionRecursion {
    public static void main(String[] args) {
        int[] arr = {7,2,4,9,7,8,2,3,22,1488,3742,42};
        System.out.println(Arrays.toString(sort(arr, 0, arr.length - 1)));
    }
    static int[] sort(int[] ats, int start, int end)
    {


        if(start > end)
            return ats;
        if(start < end)
            if(ats[start] > ats[start + 1])
            {
                int temp = ats[start];
                ats[start] = ats[start + 1];
                ats[start + 1] = temp;
            }
            sort(ats, start + 1, end);
        if(start == end)
            sort(ats, 0, end - 1);

        return ats;
    }
}
