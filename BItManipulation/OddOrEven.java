package BItManipulation;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if((num & 1) == 1) System.out.println("Odd");
        if((num & 1) != 1) System.out.println("Even");
    }
}
