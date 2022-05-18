package Classes;

class Figure{
    int dim1;
    int dim2;
    Figure(int a, int b){
        dim1 = a;
        dim2 = b;
    }
    int area(){
        System.out.print("Undefined ");
        return 0;
    }
}

class Rectangle extends Figure
{
    Rectangle(int a, int b){
        super(a, b);
    }
    int area(){
        System.out.print("Area of rectangle ");
        return dim1*dim2;
    }
}

class Triangle extends Figure{
    Triangle(int a, int b){
        super(a, b);
    }
    int area()
    {
        System.out.print("Triangle ");
        return dim1 * dim2 / 2;
    }
}
public class Area {
    public static void main(String[] args) {
        Figure figref = new Figure(2,3);
        Rectangle a1 = new Rectangle(5,4);
        Triangle a2 = new Triangle(6, 8);

        System.out.println(figref.area());
        figref = a1;
        System.out.println(figref.area());
        figref = a2;
        System.out.println(figref.area());
    }
}
