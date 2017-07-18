package sort;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by bvvy on 2017/6/17.
 */
public class QuickSort {

    public void exch(Comparable a[], int i, int j) {
        Comparable swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

    public boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }

    public void sort(Comparable a[], int lo, int hi) {
        if (hi <= lo) return;
        int j = partition(a, lo, hi);
        sort(a, lo, j - 1);
        sort(a, j + 1, hi);
    }

    public void sort(Comparable a[]) {
        sort(a, 0, a.length - 1);
    }

    public void shuffle(Comparable a[]) {
        for(int i=0;i<a.length;i++) {
        }
        Collections.shuffle(Arrays.asList(a));
    }

    public int partition(Comparable[] a, int lo, int hi) {
        int i = lo, j = hi + 1;
        while (true) {
            while (less(a[++i], a[lo])) {
                if (i == hi) break;
            }
            while (less(a[lo], a[--j])) {
                if (j == lo) break;
            }
            if (i >= j) break;
            exch(a, i, j);
        }
        exch(a, lo, j);
        return j;
    }

    public static void main(String[] args) {
        Integer[] a = {10, 3, 4, 2, 1, 8, 6, 7, 9, 11, 13, 12, 5};
        QuickSort quickSort = new QuickSort();
        quickSort.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
