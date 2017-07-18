package sort;

import java.util.Arrays;

/**
 * Created by bvvy on 2017/6/15.
 */
public class BubleSort {

    public void sort(Comparable a[]) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            for(int j=0;j<N-i-1;j++) {
                if(SortUtil.less(a[j],a[j+1])) SortUtil.swap(a, j, j + 1);
            }
        }
    }
    public static void main(String[] args) {
        BubleSort bubleSort = new BubleSort();
        Integer a[] = {3, 3, 2, 3, 1, 7, 5, 56, 62};

        bubleSort.sort(a);
        System.out.println(Arrays.toString(a));

    }

}
