package Classes;

class Pri {
    int a1;
    private int a2;
}
public class AccessControl {
    public static void main(String[] args) {
        Pri ob = new Pri();
        ob.a1 = 19;
       // ob.a2 = 10;//Error as a2 is a private member of class Pri
    }
}
