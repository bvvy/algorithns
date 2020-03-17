package sort;

import java.util.Arrays;

public class QuickSortInt {
    public static void sort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    public static void sort(int[] arr, int lo, int hi) {
        if (lo >= hi) return;
        int i = lo, j = hi + 1;
        while (true) {
            while (arr[++i] < arr[lo]) {
                if (i == hi) break;
            }
            while (arr[--j] > arr[lo]) {
                if (j == lo) break;
            }
            if (i >= j) break;
            exec(arr, i, j);
        }
        exec(arr, lo, j);
        sort(arr, lo, j - 1);
        sort(arr, j + 1, hi);
    }

    public static void exec(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 1, 5, 8, 6};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static class User {
        int id = 1;

        @Override
        public String toString() {
            return "{" +
                    "id=" + id +
                    '}';
        }
    }
}
