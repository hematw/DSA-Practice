public class LinkedList {

    Node head;

    public void PrintElements() {
        Node n = head;

        while (n != null) {
            System.out.println(n.data);
            n = n.Next;
        }
    }
}
