package sort;

import java.util.Arrays;

/**
 * Created by bvvy on 2017/6/15.
 */
public class InsertionSort {

    public void sort(Comparable a[]) {
        for(int i=0;i<a.length;i++) {
            for(int j=i;j>0&&SortUtil.less(a[j],a[j-1]);j--) SortUtil.swap(a, j, j -1);
        }
    }
    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        Double a[] = {3.5, 3.1, 2.3, 3.3, 1.6, 7.4, .5, 56.3, 62d};

        insertionSort.sort(a);
        System.out.println(Arrays.toString(a));

    }


}
