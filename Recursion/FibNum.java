package Recursion;

public class FibNum {
    public static void main(String[] args) {
        int nu;
        nu = fib(45);
        System.out.println(nu);

    }
    static int fib(int num)
    {
        if(num == 0)
            return 0;
        else if(num == 1)
            return 1;
        return(fib(num - 1) + fib(num - 2));
    }
}
