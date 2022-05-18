package Search;

import java.util.Scanner;

public class Binsea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }

        int ind = bis(arr, 45);
        System.out.println(ind + 1);

    }
    public static int bis(int[] ats, int ele)
    {

        int start = 0;
        int end = ats.length - 1;
        int mid;
        boolean isAsc = ats[start] < ats[end];

        while(start <= end)
        {
            mid = (start + end) / 2;
            if(ats[mid] == ele)
                return mid;

            else if(isAsc)
            {
                if(ats[mid] > ele)
                {
                    end = mid;
                }
                else
                {
                    start = mid + 1;
                }
            }
            else
            {
                if(ats[mid] < ele)
                {
                    end = mid;
                }
                else
                {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }
}
