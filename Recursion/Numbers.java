package Recursion;

public class Numbers {
    public static void main(String[] args) {
        nums(1);
    }
    public static int nums(int n)
    {
        if(n == 5)
        {
            System.out.println(n);
            return 5;

        }
        nums(n + 1);
        System.out.println(n);
        return 0;
    }
}
