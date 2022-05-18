import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 2 numbers ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int choice = input.nextInt();
        switch (choice)
        {
            case 1:{
                System.out.println(num1 + num2);
                break;
            }
            case 2:{
                System.out.println(num1 - num2);
                break;
            }
            case 3:{
                System.out.println(num1 * num2);
                break;
            }
            case 4:{
                System.out.println(num1 / num2);
                break;
            }
        }



    }
}
