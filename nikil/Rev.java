import java.net.SecureCacheResponse;
import java.util.Scanner;

public class Rev {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num = inp.nextInt();
        int place= 1;
        int rev = 0;
        int digit;
        while(place <= num)
        {
            digit =(num % (10 * place)) / place;
            rev = rev * 10 + digit;
            place *= 10;
        }
        System.out.println(rev);
    }
}
