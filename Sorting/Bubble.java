package Sorting;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int arr[] = {5,2,7,8,6,3,1};
        int size = arr.length - 1;

        bubbleSort(arr, size);
    }
    public static int[] bubbleSort(int[] ats, int size)
    {
        int trav;
        int temp;
        int times;
        for(times = 0; times < size; times += 1)
        {
            for(trav = 0; trav < size - times; trav += 1)
            {
                if(ats[trav] > ats[trav + 1])
                {
                    temp = ats[trav];
                    ats[trav] = ats[trav + 1];
                    ats[trav + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(ats));
        return ats;
    }
}
