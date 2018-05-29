package algorithm_4_edition.ex1_1;

import java.util.Arrays;

/**
 * @author bvvy
 * @date 2018/5/21
 */
public class Ex1_1_19 {

    public static long F(int N) {
        if (N == 0) return 0;
        if (N == 1) return 1;
        return F(N - 1) + F(N - 2);
    }

    public static long[] FA(int N) {
        long[] arr = new long[N];
        for (int i = 0; i < N; i++) {
            if (i == 0) arr[0] = 0;
            if (i == 1) {
                arr[1] = 1;
            }
            if (i > 1) {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(FA(10)));
    }
}
