package LL;

public class CustomLL {
    private Node head = null;
    private Node tail = null;
    int size = 0;
    private class Node {
        private int value;
        private Node next;

        Node(int value) {
            this.value = value;
            size += 1;
        }

        Node(int value, Node next) {
            this.value = value;
            this.next = next;
            size += 1;
        }
    }

        public void addFirst(int value)
        {
            Node temp = new Node(value);
            if(head == null)
            {
                head =  temp;
                tail = head;
                return;
            }
            temp.next = head;
            head = temp;
        }

        public void addLast(int val) {
            Node temp = new Node(val);
            if(tail == null) {
                tail = temp;
                head = tail;
                return;
            }
            tail.next = temp;
            tail = temp;
        }

        public void addPos(int val, int pos) {
            if(pos < 0) {
                addFirst(val);
                return;
            }
            if(pos > size) {
                addLast(val);
                return;
            }
            Node temp = new Node(val);
            Node th = head;
            while(pos > 1) {
                th = th.next;
                pos -= 1;
            }
            temp.next = th.next;
            th.next = temp;
        }

        public void delFirst() {
            Node temp = head;
            head = head.next;
            temp = null;
        }

        public void delLast() {
            Node th1 = head;
            Node th2 = head.next;
            while(th2.next != null) {
                th1 = th1.next;
                th2 = th2.next;
            }
            tail = th1;
            tail.next = null;
        }

        public void delPos(int pos) {
            Node th = head;
            while(pos > 1) {
                th = th.next;
                pos -= 1;
            }
            th.next = (th.next).next;
        }


        public void display() {
            Node temp = head;
            while(temp != null) {
                System.out.print(temp.value +" ->");
                temp = temp.next;
            }
            System.out.println("End");
        }

    public static void main(String[] args) {
        CustomLL temp = new CustomLL();
    }
}
