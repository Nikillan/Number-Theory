import java.util.Scanner;

public class Case {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        char ch = inp.next().trim().charAt(0);
        if(ch >= 'A' && ch <= 'Z')
            System.out.println("Upper case");
        else if(ch >= 'a' && ch <= 'z')
            System.out.println("Lower case");
        else
            System.out.println("Undefined");
    }
}
