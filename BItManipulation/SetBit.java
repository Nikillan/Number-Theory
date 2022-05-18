package BItManipulation;

public class SetBit {
    public static void main(String[] args) {
        int num = 81237941;
        int count = 0;
       // int set = 0;
        System.out.println(Integer.toBinaryString(num));
        do {
            num = (num & (num -1));
            count += 1;
        }while((num > 0) == true);
        System.out.println(count);
    }
}
