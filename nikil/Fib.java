public class Fib {
    public static void main(String[] args) {
        int term = 7;
        int a = 0;
        int b = 1;
        while(term-- > 0)
        {
            int temp = b;
            b = b + a;
            a = temp;
        }
        System.out.println("Fib is: " + a);
    }
}
