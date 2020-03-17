package sort;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MergeSortInt {
    public static void main(String[] args) {

        int[] arr = {3, 1, 2, 4, 6, 5, 7, 9, 8, 10, 11, 12, 13, 14, 15};
        sort(arr);
        System.out.println(Arrays.toString(arr));

        String s = "123111546466481861844";
        String val = "121212";

        Map<String, String> map = new HashMap<>();
        map.put(s, val);
        System.out.println(map);
    }

    public static void sort(int[] arr) {
        int[] aux = new int[arr.length];
        sort(arr, aux, 0, arr.length-1);
    }

    public static void sort(int[] arr, int[] aux, int lo, int hi) {
        if (lo >= hi) return;
        int mid = (lo + hi) / 2;
        sort(arr, aux, lo, mid);
        sort(arr, aux, mid + 1, hi);
        for (int i = lo; i <= hi; i++) {
            aux[i] = arr[i];
        }
        System.out.println(Arrays.toString(aux));
        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            if (i > mid) arr[k] = aux[j++];
            else if (j > hi) arr[k] = aux[i++];
            else if (aux[i] > aux[j]) arr[k] = aux[j++];
            else arr[k] = aux[i++];
        }
    }
}
