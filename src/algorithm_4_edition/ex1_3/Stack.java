package algorithm_4_edition.ex1_3;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

/**
 * @author bvvy
 * @date 2018/5/29
 */
public class Stack<Item> implements Iterable<Item> {

    private Node first;
    private int N;

    public int size() {
        return N;
    }

    public void push(Item item) {
        Node temp = first;
        first = new Node();
        first.item = item;
        first.next = temp;
        N++;
    }

    public Item pop() {
        Item item = first.item;
        first = first.next;
        N--;
        return item;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public Item peek() {
        return first.item;
    }

    @NotNull
    @Override
    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item> {
        private Node current = first;
        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }

    private class Node {
        Item item;
        Node next;
    }

    @Override
    public String toString() {
        String s = "";
        Node tmp = first;
        while (tmp.next != null) {
            s += tmp.item.toString()+"  ";
            tmp = tmp.next;
        }
        return s;
    }
}
