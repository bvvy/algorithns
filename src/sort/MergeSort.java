package sort;

import com.sun.scenario.effect.Merge;

import java.awt.*;
import java.util.Arrays;

/**
 * Created by bvvy on 2017/6/16.
 */
public class MergeSort {

    public void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi) {
        //第一步 将数组拷贝进辅助数组
        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        }
        System.out.println(Arrays.toString(aux));

        int i = lo, j = mid + 1;//i从lo开始，j从中间开始
        for (int k = lo; k <= hi; k++) {
            if (i > mid) a[k] = aux[j++];
            else if (j > hi) a[k] = aux[i++];
            else if (SortUtil.less(aux[j], aux[i])) a[k] = aux[j++];
            else a[k] = aux[i++];
        }
    }

    public void sort(Comparable a[], Comparable[] aux, int lo, int hi) {
        if (lo >= hi) return;
        int mid = (lo + hi) / 2;
        sort(a, aux, lo, mid);
        sort(a, aux, mid + 1, hi);
        merge(a, aux, lo, mid, hi);
    }

    public void sort(Comparable a[]) {
        Comparable aux[] = new Comparable[a.length];
        sort(a, aux, 0, a.length - 1);
    }

    public void sortBottomUp(Comparable[] a) {
        int N = a.length;
        Comparable aux[] = new Comparable[N];
        for (int sz = 1; sz < N; sz = sz + sz) {//1  2  4   8
            for (int lo = 0; lo < N - sz; lo += sz + sz) {// N-sz  =  12 11 9 5
                merge(a, aux, lo, lo + sz - 1, Math.min(lo + sz + sz - 1, N - 1));
            }
        }
    }

    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        Integer a[] = {0, 1, 5, 3, 5, 6, 2, 4, 3, 1, 5, 6, 7};
        mergeSort.sortBottomUp(a);
        System.out.println(Arrays.toString(a));
    }

}
