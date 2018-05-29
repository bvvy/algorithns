package algorithm_4_edition.ex1_3;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;
import java.util.function.Consumer;

/**
 * @author bvvy
 * @date 2018/5/29
 */
public class FixedCapacityStackOfStrings implements Iterable<String> {


    @NotNull
    @Override
    public Iterator<String> iterator() {
        return new StringIterator();
    }
    private class StringIterator implements Iterator<String> {

        private int i = N;
        @Override
        public boolean hasNext() {
            return i > 0;
        }

        @Override
        public String next() {
            return a[--i];
        }
    }

    private String[] a;
    private int N;

    public FixedCapacityStackOfStrings(int cap) {
        this.a = new String[cap];
    }

    public void push(String item) {
        a[N++] = item;
    }

    public void pushAll(String[] items) {
        for (String item : items) {
            this.push(item);
        }
    }

    public String pop() {
        return a[--N];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public boolean isFull() {
        return N == a.length;
    }
}
