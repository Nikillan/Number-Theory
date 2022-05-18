package Sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args){
        int[] arr = {4,3,2,7,8,2,3,1};
        cycSort(arr);

    }
    public static int[] cycSort(int[] ats)
    {
        int size = ats.length - 1;
        int ele = 0;
        int temp;
        int correct;
        int check = 0;

        while(ele < size)
        {
            correct = ats[ele] -  1;
            if(ats[ele] != ats[correct])
            {
                temp = ats[ele];
                ats[ele] = ats[correct];
                ats[correct] = temp;
                continue;
            }
            ele += 1;
        }

        System.out.println(Arrays.toString(ats));
        return ats;
    }
}
