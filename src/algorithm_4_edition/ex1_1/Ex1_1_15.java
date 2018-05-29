package algorithm_4_edition.ex1_1;

import java.util.Arrays;

/**
 * @author bvvy
 * @date 2018/5/21
 */
public class Ex1_1_15 {

    public static int[] histogram(int a[], int M) {
        int ta[] = new int[M];
        for (int i = 0; i < M; i++) {
            int tmp = 0;
            for (int anA : a)
                if (anA == i) tmp++;
            ta[i] = tmp;
        }
        return ta;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 2, 1};
        System.out.println(Arrays.toString(histogram(arr, 4)));
    }
}
