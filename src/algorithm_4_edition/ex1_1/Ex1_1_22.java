package algorithm_4_edition.ex1_1;

import com.sun.org.apache.xalan.internal.xsltc.dom.SortingIterator;
import sun.java2d.pipe.SpanIterator;

/**
 * @author bvvy
 * @date 2018/5/21
 */
public class Ex1_1_22 {
    private static int binarySearch(int[] arr, int s) {
        return rank(arr, s, 0, arr.length - 1, 1);
    }

    private static int rank(int[] arr, int s, int lo, int hi, int deep) {
        if (lo > hi) return -1;
        for (int i = 0; i < deep; i++) {
            System.out.print("---");
        }
        System.out.println(lo + "--" + hi);
        int mid = (lo + hi) / 2;
        if (arr[mid] > s) return rank(arr, s, lo, mid - 1, ++deep);
        else if (arr[mid] < s) return rank(arr, s, mid + 1, hi, ++deep);
        else return mid;
    }


    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 7, 8, 9, 10};
        System.out.println(binarySearch(arr, 9));
    }

}
