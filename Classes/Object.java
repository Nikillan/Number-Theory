package Classes;

class Obj{
    int l;
    int h;
    int w;
}
public class Object {
    public static void main(String[] args) {
        Obj b1 = new Obj();
        Obj b2 = new Obj();

        b1.l = 10;
        b1.h =30;
        b1.w = 20;
        b2 = b1;
        b2.h = 40;

        System.out.println(b1.h +" "+b2.h);
    }

}
