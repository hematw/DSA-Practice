public class Driver {

    public static void main(String[] args) {
        DoublyLinkedlist dll = new DoublyLinkedlist(100);

        dll.append(220);
        dll.append(340);
        dll.append(430);
        dll.append(530);
        dll.append(630);

        dll.printElements();

        // dll.setNode(2, 5000);
        // System.out.println(dll.getNode(4));
        System.out.println("------------------------------");

        dll.setNode(5, 6000);

        
        dll.printElements();
        System.out.println("------------------------------");
        dll.removeNode(3);
        dll.printElements();
    }

}