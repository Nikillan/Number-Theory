package str;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int flag = 0;
        String inp = in.next();
        int size = inp.length();
        for (int check = 0; check < size / 2; check++) {
            if(inp.charAt(check) != inp.charAt(size - check - 1))
            {
                flag = 1;
                System.out.println(inp + " is not a Palindrome");
                break;
            }

        }
        if(flag == 0)
        {
            System.out.println(inp + " is a palindrom");
        }
      //  return 1;
    }
}
