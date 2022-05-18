package arrays;

import java.util.Arrays;

public class Rev {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int size = arr.length;
        System.out.println(size);
        rev(arr, 0, 6);
        System.out.println(Arrays.toString(arr));

    }
    public static int[] rev(int arr[],int start,int end)
    {
        end -= 1;
        int temp;
        for (int trav = 0; trav < 3; trav++) {
            temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
        return(arr);
    }
}
