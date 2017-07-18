package sort;

import java.util.Arrays;

/**
 * Created by bvvy on 2017/6/15.
 */
public class SelectionSort {

    public void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++) {
                if (SortUtil.less(a[j], a[min])) min = j;
            }
            SortUtil.swap(a, i, min);
        }
    }

    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        Integer a[] = {3, 3, 2, 3, 1, 7, 5, 56, 62};

        selectionSort.sort(a);
        System.out.println(Arrays.toString(a));

    }


}
