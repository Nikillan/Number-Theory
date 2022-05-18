package BItManipulation;

public class Set {
    public static void main(String[] args) {
        int i = 3;
        int num = 10;
        int ls = 1;
        for (int times = i; times > 1 ; times--) {
            ls <<= ls;
        }
        num = num | ls;
        System.out.println(num);
    }
}
