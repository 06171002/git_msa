package org.example;



// add
// add(index,obj)
// remove
// set
// get
// size
public class MyLinkedListV1 {
    private Node first;
    private int size = 0;

    public void add(Object o) {
        Node newNode = new Node(o);
        if (first == null){
            first = newNode;
        }else {
            Node lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }

    private Node getLastNode() {
        Node x = first;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

    public void add(int index, Object o) {
        Node newNode = new Node(o);
        if (index == 0) {
            newNode.next = first;
            first = newNode;
        } else {
            Node prevNode = getNode(index -1);
            newNode.next = prevNode.next;
            prevNode.next = newNode;
        }
        size++;
    }

    private Node getNode(int index) {
        Node x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    public Object remove(int index, Object o) {
        Node node = getNode(index);
        Object removeItem = node.item;
        if (index == 0) {
            first = node.next;
        }else {
            Node prevNode = getNode(index - 1);
            prevNode.next = node.next;
        }
        node.item = null;
        node.next = null;
        size--;
        return removeItem;
    }

    public Object set(int index, Object o) {
        Node node = getNode(index);
        Object oldValue = node.item;
        node.item = o;
        return oldValue;
    }

    public Object get(int index) {
        return getNode(index).item;
    }

    public int indexOf(Object o) {
        int index = 0;
        for (Node x = first; x.next != null; x = x.next){
            if (o.equals(x.item)){
                return index;
            }
            index++;
        }
        return -1;
//        Node x = first;
//        for (int i = 0; i < size; i++) {
//            if (o.equals(x.item)) {
//                return i;
//            }
//            x = x.next;
//        }
//        return -1;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyLinkedListV1{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }
}
