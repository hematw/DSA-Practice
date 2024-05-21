public class Driver {

    public static void main(String[] args) {
        DoublyLinkedlist dll= new DoublyLinkedlist(330);

        dll.append(220);
        dll.append(340);
        dll.append(130);

        // dll.printElements();

        System.out.println(dll.getNode(2).value);;
    }
    
}