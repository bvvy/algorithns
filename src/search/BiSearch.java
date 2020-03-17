package search;

public class BiSearch {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(search(arr, 6));
    }

    private static int search(int[] arr, int key) {
        return search(arr, 0, arr.length - 1, key);
    }

    private static int search(int[] arr, int lo, int hi, int key) {
        if(lo > hi) return -1;
        int mid = (lo + hi) / 2;
        if (arr[mid] == key) return mid;
        if (key > arr[mid]) lo = mid + 1;
        if (key < arr[mid]) hi = mid - 1;
        return search(arr, lo, hi, key);
    }
}
