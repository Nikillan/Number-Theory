package BItManipulation;

public class ithBit {
    public static void main(String[] args) {
        int a = 10;
        int i = 2;
        int ls = 1;
        for(i = 2; i > 1; i--)
        {
            ls <<= ls;
        }
        System.out.println(a & ls);
    }
}
