package arrays;

public class Linsearch {
    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 6, 5, 9};
        int size = arr.length - 1;
        System.out.println(linse(arr, 10, size));
    }
    public static int linse(int[] arr, int ele, int size)
    {
        int fix;
        if(size == 0)
            return -1;
        for(fix = 0; fix < size; fix += 1)
            if(arr[fix] == ele)
                return fix;
        return -1;
    }
}
