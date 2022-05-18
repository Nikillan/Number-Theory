import java.util.Scanner;

public class Occ {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        long num = inp.nextInt();
        int occnum = inp.nextInt();
        int occ = 0;
        int place = 1;
        while(place <= num)
        {
            if((num % (10 * place)/place) == occnum)
                occ += 1;
            place *= 10;
        }
        System.out.println(occ);
    }
}
