package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args)
    {
        int[] arr = {5,2,6,7,3,1,0};
        selectSort(arr);
    }
    public static int[] selectSort(int[] ats)
    {
        int trav;
        int size;
        int temp;
        int times;
        size = ats.length - 1;

        for(times = 0; times < size; times += 1)
        {
            for(trav = times + 1; trav <= size; trav += 1)
            {
                if(ats[times] > ats[trav])
                {
                    temp = ats[times];
                    ats[times] = ats[trav];
                    ats[trav] = temp;
                }
            }

        }
        System.out.println(Arrays.toString(ats));


        return ats;
    }
}
