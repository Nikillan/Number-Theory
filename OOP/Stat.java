package OOP;

public class Stat {
    int area;
    void out(){
        System.out.println("Hello there");
    }
    static class sum{
        int a;
        int b;
        int total(){
            return a + b;
        }
        int total(int a, int b){
            return a + b;
        }
        sum(int a, int b){
            this.a = a;
            this.b = b;
        }
        sum(){
            a = 10;
            b = 5;
        }
    }


    public static void main(String[] args) {
        sum ob = new sum(10, 20);
        sum ob1 = new sum();
        System.out.println(ob.total());
        System.out.println(ob.total(4,5));
        System.out.println(ob1.b);

        area ob2 = new area(1, 4);
        ob2.sqarea();


    }
    public static class area{
        int a;
        int b;
        area(int a, int b){
            this.a = a;
            this.b = b;
        }

        int sqarea()
        {
            return a * a;
        }

        int sqarea(int a)
        {
            return a * a;
        }
    }
}
