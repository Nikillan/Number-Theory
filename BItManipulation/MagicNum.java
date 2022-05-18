package BItManipulation;

public class MagicNum {
    public static void main(String[] args) {
        int term = 20;
        int until = term;
        int mn = 0;
        for (int i = 1; i <= until; i++) {
            //System.out.println(term +" "+ i +" "+(term  & 1));
            mn += (int)((term & 1) * Math.pow(5,i));
            term >>= 1;
          //  System.out.println(term +" "+ i);

        }
        System.out.println(mn);

    }
}
