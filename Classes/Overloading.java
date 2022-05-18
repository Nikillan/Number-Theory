
package Classes;
public class Overloading {
    public static void main(String[] args) {
        over a1 = new over();
        over a2 = new over();
        System.out.println(a2.area(10.4, 12));
        System.out.println(a1.area(10, 20));
    }
}
class over{
    double length;

    double height;
    public double area(double length, double height){
        System.out.println("Area double");
        return length*height;
    }

    public int area(int l, int h){
        System.out.println("Area int");
        return l * h;
    }

}
