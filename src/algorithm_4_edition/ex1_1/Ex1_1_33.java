package algorithm_4_edition.ex1_1;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Ex1_1_33 {

    static class Matrix {
        public static double dot(double[] x, double[] y) {
            double result = 0;
            for (int i = 0; i < x.length; i++) {
                result += x[i] * y[i];
            }
            return result;
        }

        public static double[][] mult(double[][] a, double[][] b) {
            double[][] s = new double[a.length][b[0].length];
            for (int i = 0; i < s.length; i++) {
                for (int j = 0; j < s[i].length; j++) {
                    for (int k = 0; k < b.length; k++) {
                        s[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
            return s;

        }

        public static double[][] transpose(double[][] a) {
            double[][] s = new double[a[0].length][a.length];
            for (int i = 0; i < s.length; i++) {
                for (int j = 0; j < s[i].length; j++) {
                    s[i][j] = a[j][i];
                }
            }
            return s;

        }

        public static double[] mult(double[][] a, double[] x) {
            double[] y = new double[a.length];
            for (int i = 0; i < y.length; i++) {
                for (int j = 0; j < x.length; j++) {
                    y[i] += a[i][j] * x[j];
                }
            }
            return y;
        }

        public static double[] mult(double[] y, double[][] a) {
            double[] x = new double[a[0].length];
            for (int i = 0; i < x.length; i++) {
                for (int j = 0; j < y.length; j++) {
                    x[i] += y[j] * a[j][i];
                }
            }
            return x;

        }
    }

    public static void main(String[] args) {
    }
}