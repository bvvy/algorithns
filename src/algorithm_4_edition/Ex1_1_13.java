package algorithm_4_edition;

import java.util.Arrays;

/**
 * @author bvvy
 * @date 2018/5/21
 */
public class Ex1_1_13 {

    public static int[][] shiftArr(int a[][]) {
        int ta[][] = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                ta[i][j] = a[j][i];
            }
        }
        return ta;
    }

    public static void main(String[] args) {
        int arr[][] = {{1, 2}, {3, 4}};
        System.out.println(Arrays.deepToString(shiftArr(arr)));
    }
}
