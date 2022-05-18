package BItManipulation;

import org.w3c.dom.ls.LSOutput;

public class Operators {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        int c = 1;
        int d = 0;
        System.out.println(((a & b) == 1) +" "+ ((a & c) == 1)); //&(and operator) gives true if a and b are true, gives false if a or b is false.
        System.out.println(((a | b) == 1) +" "+ ((d | b) == 1)); // |(or operator) gives true if a or b is true, gives false if a and b are false.
        System.out.println(~32); // ~ (negation operator) gives the reversed binary value

    }

}
