import java.util.Scanner;

public class Largest
{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num1 = inp.nextInt();
        int num2 = inp.nextInt();
        int num3 = inp.nextInt();

        if(num1 >= num2 && num1 >= num3)
            System.out.println(num1 + " is the max num");
        else if(num3 >= num2 && num3 >= num1)
            System.out.println(num3 + " is the max num");
        else
            System.out.println(num2 + " is the max num");
    }
}
