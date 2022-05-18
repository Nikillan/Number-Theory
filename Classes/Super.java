package Classes;

class sup{
    int a;
    int b;
    sup(int a, int b)
    {
        this.a = a;
        this.b = b;
    }
    void show()
    {
        System.out.println("Hello sup!!");
    }
}

class sub extends sup{
    int c;
    sub(int a, int b, int c){
        super(a, b);
        this.c = c;
    }
    void show()
    {
        super.show();
    }
}

class supb extends sub{
    int d;
    supb(int a, int b, int c, int d){
        super(a,b,c);
        this.d= d;
    }
    void show() {
        System.out.println("In supb");
    }
}
public class Super {
    public static void main(String[] args)
    {
        sub obj = new sub(2,3,4);
        sub c1;
        obj.show();
        supb obj1 = new supb(1,2,3,4);
        obj1.show();
        c1 = obj1;
        System.out.println(c1.a);
        obj1.a = 20;
        System.out.println(c1.a);

    }
}
