package Search;

import java.util.Scanner;

public class BinRec {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80};
        Scanner scan = new Scanner(System.in);
        int num;
        num = scan.nextInt();
        bins(arr, 0, arr.length - 1, num);
    }
    static void bins(int[] ats, int start, int end,int num)
    {
        int middle = (start + end) / 2;
        if(num < ats[start] || num > ats[end])
        {
            System.out.println("-1");
            return;
        }
        if(start > end )
            System.out.println("-1");
        else if(ats[middle] == num)
            System.out.println(middle);
        else if(num > ats[middle])
            bins(ats, middle + 1, end, num);
        else
            bins(ats, start, middle - 1, num);

    }
}
