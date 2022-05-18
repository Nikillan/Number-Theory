package BItManipulation;

public class NoD {
    public static void main(String[] args) {
        int num = 5;
        int base = 2;
        int nod = 0;
        nod = (int)((Math.log(num)/Math.log(base)) + 1);
        System.out.println(nod);
    }
}
