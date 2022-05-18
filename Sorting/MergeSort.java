package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {4,2,5,6,2,7,3,12,15,19,13,17,16,27,23,29,24,26,20,34,39,31,37,36,38,30,49,43,48,47,42,46,41,45,50};
        arr = ms(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    static int[] ms(int[] ats, int start, int end)
    {
        if(start < end)
        {
            int mid = (start + end) / 2;
            ms(ats, start, mid);
            ms(ats, mid + 1, end);

            merge(ats, start, mid, end);
        }
        return ats;
    }

    static void merge(int[] mer, int start, int mid, int end)
    {
        int ls = mid - start + 1;
        int rs = end - mid;

        int[] la = new int[ls];
        int[] ra = new int[rs];

        int left = 0;
        int right = 0;
        int ori = start;
        while(left < ls)
            la[left++] = mer[ori++];
        while(right < rs)
            ra[right++] = mer[ori++];

        ori = start;
        left = 0;
        right = 0;

        while(left < ls && right < rs)
        {
            if(la[left] < ra[right])
            {
                mer[ori++] = la[left++];
            }
            else
            {
                mer[ori++] = ra[right++];
            }
        }

        while(left < ls) mer[ori++] = la[left++];
        while(right < rs) mer[ori++] = ra[right++];
    }


}

