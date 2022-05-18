package Recursion;

public class Rec {
    public static void main(String[] args) {
        message(5);
    }
    public static int message(int times)
    {
        if(times == 0)
            return 0;
        System.out.println("Hello there " + times);
        return message(times - 1);
    }
}
