
import java.util.ArrayList;
import java.util.Arrays;

class LinkedListExample {

    static class LinkedList {

        Node head;

        LinkedList() {
            head = null;
        }

        void addNode(Node newNode) {
            if (head == null) {
                head = newNode;
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
        }

        void removeNode() {
            if (head == null) {
                throw new RuntimeException("removing from empty list!");
            }
            head = head.next;
        }

        void print() {
            if (head == null) {
                System.out.println("");
            }

            Node current = head;
            while (current != null) {
                System.err.print(String.format("%s -> ", current.value));
                current = current.next;
            }
        }
    }

    static class Node {

        int value;
        Node next;

        Node(int value) {
            this.value = value;
            next = null;
        }
    }

    public static void main(String[] args) {

        // static array
        int[] arr = new int[]{0, 1, 2, 3};

        System.out.println(arr[2]);

        // dynamic array
        ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));

        // convert array to LL
        LinkedList myLinkedList = new LinkedList();

        for (int i = 0; i < arrList.size(); i++) {
            Node newNode = new Node(i);
            myLinkedList.addNode(newNode);
        }

        myLinkedList.print();

    }
}
