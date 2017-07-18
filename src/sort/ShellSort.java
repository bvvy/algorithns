package sort;

import java.util.Arrays;

/**
 * Created by bvvy on 2017/6/15.
 */
public class ShellSort {

    public void sort(Comparable a[]) {
        int N = a.length;
        int h = 1;
        while (h < N / 3) h = 3 * h + 1;
        while (h >= 1) {
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h && SortUtil.less(a[j], a[j - h]); j -= h)
                    SortUtil.swap(a, j, j - h);
            }
            h /= 3;
        }
    }

    public static void main(String[] args) {
        ShellSort shellSort = new ShellSort();
        Double a[] = {3.5, 3.1, 2.3, 3.3, 1.6, 7.4, .5, 56.3, 62d};

        shellSort.sort(a);
        System.out.println(Arrays.toString(a));

    }
}
