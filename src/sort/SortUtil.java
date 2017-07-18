package sort;

/**
 * Created by bvvy on 2017/6/15.
 */
public class SortUtil {

    public static void swap(Comparable[] c, int a, int b) {
        Comparable swap = c[a];
        c[a] = c[b];
        c[b] = swap;
    }

    public static boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }
}
