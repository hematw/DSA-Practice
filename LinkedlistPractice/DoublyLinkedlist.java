
public class DoublyLinkedlist {
  Node head;
  Node tail;
  private int length;

  class Node {
    Node prev;
    Node next;
    int value;

    Node(int value) {
      this.value = value;
    }
  }

  DoublyLinkedlist(int value) {
    Node newNode = new Node(value);
    this.head = newNode;
    this.tail = newNode;
    length = 0;
  }

  public int getLength() {
    return length;
  }

  public void append(int data) {
    Node newNode = new Node(data);

    if (head == null) {
      head = newNode;
      tail = newNode;
    } else {
      tail.next = newNode;
      newNode.prev = tail;
      tail = newNode;
    }
    length++;
  }

  public Node removeLast() {
    if (tail == null) {
      return null;
    }

    Node temp = tail;
    if (length == 1) {
      head = null;
      tail = null;
    } else {
      tail = tail.prev;
      tail.next = null;
      temp.prev = null;
    }
    length--;
    return temp;
  }

  public void prepend(int value) {
    Node newNode = new Node(value);
    if (head == null) {
      head = newNode;
      tail = newNode;
    } else {
      newNode.next = head;
      head.prev = newNode;
      head = newNode;
    }
    length++;
  }

  public Node removeFirst() {
    if (head == null)
      return null;

    Node temp = head;
    if (length == 1) {
      head = null;
      tail = null;
    } else {
      head = head.next;
      head.prev = null;
      temp.next = null;
    }
    length--;
    return temp;
  }

  public Node getNode(int index) {
    if (index < 0 || index >= length) {
      return null;
    }

    Node temp;
    if (index < length / 2) {
      temp = head;
      for (int i = 0; i < index; i++) {
        temp = temp.next;
      }
    } else {
      temp = tail;
      for (int i = length - 1; i > index; i--) {
        temp = temp.prev;
      }
    }
    return temp;
  }

  public void printElements() {
    Node temp = head;

    while (temp != null) {
      System.out.println(temp.value);
      temp = temp.next;
    }
  }
}
