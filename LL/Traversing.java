package LL;

class Traversing {
    public static void main(String[] args) {
        CustomLL list = new CustomLL();
        list.addFirst(10);
        list.addFirst(20);
        list.addLast(30);
        list.addLast(40);
        list.addPos(50, -10);
        list.display();
        list.delPos(2);
        list.display();

    }
}