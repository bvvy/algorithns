package algorithm_4_edition.ex1_3;

/**
 * @author bvvy
 * @date 2018/5/29
 */
public class LinkList<Item> {
    private Node first;
    private int N;

    private class Node {
        Item item;
        Node next;
    }

    void add(Item item) {
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        N++;
    }

}
