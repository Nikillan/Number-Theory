import java.util.Scanner;

public class Conditional
{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int tc = inp.nextInt();
        do
        {
            int salary = inp.nextInt();
            if(salary > 1000)
                System.out.println("Rich kid");
            else if(salary >500)
                System.out.println("Middle kid");
            else
                System.out.println("Unknown kid");
        }while(tc-- > 0);
    }
}
