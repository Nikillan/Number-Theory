package Recursion;

public class Fact {
    public static void main(String[] args) {
        long num = 20;
        System.out.printf("%d", fac(num));
    }

    private static long fac(long num) {
        if(num <= 1)
            return 1;
        return (num * fac(num - 1));
    }
}
