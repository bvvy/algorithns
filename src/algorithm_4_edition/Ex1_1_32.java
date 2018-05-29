package algorithm_4_edition;

import edu.princeton.cs.algs4.StdDraw;

import java.util.Arrays;

public class Ex1_1_32 {

    private static void retDiagram(double[] arr, int N, double l, double r) {
        double[] xP = new double[N + 1];
        for (int i = 0; i < xP.length; i++) {
            xP[i] = (r - l) / N * i + l;
            System.out.println((r - l) / N * i + l);
        }
        System.out.println(Arrays.toString(xP));
        for (int i = 0; i < xP.length - 1; i++) {
            double h = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] >= xP[i] && arr[j] < xP[i + 1]) {
                    h += 0.1;
                }
            }
            StdDraw.rectangle(0.1 * i+0.1, 0, 0.05, h);
        }
    }

    public static void main(String[] args) {
        double arr[] = {1.1, 1.2, 1.3, 1.4, 1.43, 1.53, 1.65, 1.90, 1.34, 1.90, 1.85, 1.75};
        retDiagram(arr, 5, 1.0, 2.0);
    }
}