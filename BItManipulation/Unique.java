package BItManipulation;

public class Unique {
    public static void main(String[] args) {
        int[] num = {1,2,1,3,4,3,4};
        int unique = 0;
   //     int i = 0;
        for (int i = 0; i < num.length; i++) {
            unique ^= num[i];
        }
        System.out.println(unique);

    }
}
