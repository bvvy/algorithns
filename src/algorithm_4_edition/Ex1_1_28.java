package algorithm_4_edition;

import java.net.SocketTimeoutException;
import java.util.Arrays;

/**
 * @author bvvy
 * @date 2018/5/21
 */
public class Ex1_1_28 {
    private static int times = 0;

    public static int[] removeSaveElement(int[] arr) {
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            }
        }
        int tmp[] = new int[arr.length - count];
        tmp[0] = arr[0];
        for (int i = 1, j = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                tmp[j] = arr[i];
                j++;
            }
        }
        return tmp;
    }

    public static void main(String[] args) {

        int[] arr = {1, 1, 3, 4, 5, 6, 6, 7, 7, 8, 9, 9, 9, 9};
        arr = removeSaveElement(arr);
        System.out.println(Arrays.toString(arr));
    }
}
