package Hashmap;

public class Hashmap {
    private int size;
    private Node[] table;

    class Node {
        String key;
        int value;
        Node next;

        Node(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public Hashmap(int size) {
        this.size = size;
        table = new Node[size];
    }

    public void printHashTable() {

        for (int i = 0; i < size; i++) {
            // if (table[i] == null) {
            // System.out.println("Hashmap is empty can NOT print anything !!!");
            // break;
            // }

            System.out.println("table [" + i + "] = ");

            Node temp = table[i];
            while (temp != null) {
                System.out.println("\t {" + temp.key + " = " + temp.value + "}");
                temp = temp.next;
            }
        }

    }

    private int hash(String key) {
        int hash = 0;
        char[] charsArrOKey = key.toCharArray();

        for (int i = 0; i < charsArrOKey.length; i++) {
            int ascciValue = charsArrOKey[i];
            hash = (hash + ascciValue * 23) % table.length;
        }
        return hash;
    }

    public void set(String key, int value) {
        Node keyValuePair = new Node(key, value);
        int indexOfSpace = hash(key);

        if (table[indexOfSpace] == null) {
            table[indexOfSpace] = keyValuePair;
        } else {
            Node temp = table[indexOfSpace];
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = keyValuePair;
        }
    }
}
