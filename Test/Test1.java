package Test;

public class Test1 {
    public static void main(String[] args) {
        String a = "Niki";
        String b = "Niki";
        a += "ll";
        System.out.println((a == b) +" "+ a + " " + b);
        StringBuilder a1 = new StringBuilder("Niki");
        StringBuilder a2 = a1;
        a1.append("llan");
        System.out.println(a1);
        a1.delete(3, 5);
        System.out.println((a1 == a2) + " "+ a1 +" "+ a2);
    }
}
