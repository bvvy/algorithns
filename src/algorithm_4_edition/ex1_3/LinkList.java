package algorithm_4_edition.ex1_3;

/**
 * @author bvvy
 * @date 2018/5/29
 */
public class LinkList<Item> {
    private Node first;
    private Node last;
    private int N;

    private class Node {
        Item item;
        Node next;
    }

    public void add(Item item) {
        Node oldLast = last;
        last = new Node();
        last.item = item;
        if(isEmpty()) first = last;
        else oldLast.next = last;
        N++;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public void removeLast() {
        Node oldLast = last;

        last.next = null;
        last.item = null;
        this.last = null;
        N--;

    }

}
