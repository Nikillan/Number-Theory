package Classes;

import java.util.Arrays;

class Stud{
    String name;
    int id;
    float mark;
    void display()
    {
        System.out.println("Name "+ name);
        System.out.println("ID "+ id);
        System.out.println("Mark "+ mark);
    }
    Stud(){
        name = "ABC";
        id = 111;
        mark = 00.00f;
    }
}
public class Student {
    public static void main(String[] args) {
        Stud stud1 = new Stud();
        Stud stud2 = new Stud();
        stud1.name = "Nikillan";
        stud1.id = 228;
        stud1.mark = 48.9f;
        stud1.display();
        stud2.display();


//        stud2[0].name = "Prathi";
//        stud2[0].id = 246;
//        stud2[0].mark = 49.3f;

    }
}
