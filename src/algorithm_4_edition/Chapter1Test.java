package algorithm_4_edition;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author bvvy
 * @date 2018/5/20
 */

public class Chapter1Test {

    @Test
    public void test1_1_1_a() {
        Assertions.assertEquals((0 + 15) / 2, 7);
    }

    @Test
    public void test1_1_1_b() {
        Assertions.assertEquals(2.0e-6 * 100000000.1, 200.0000002);
    }

    @Test
    public void test1_1_1_c() {
        Assertions.assertEquals(true && false || true && true, true);
    }

    @Test
    public void test1_1_2_a() {
        Assertions.assertEquals((1 + 2.236) / 2, 1.618);
    }

    @Test
    public void test1_1_2_b() {
        Assertions.assertEquals(1 + 2 + 3 + 4.0, 10.0);
    }

    @Test
    public void test1_1_2_c() {
        Assertions.assertEquals(4.1 >= 4, true);
    }

    @Test
    public void test1_1_2_d() {
        Assertions.assertEquals(1 + 2 + "3", "33");
    }

    @Test
    public void test1_1_5() {
        Assertions.assertFalse(Ex1_1_5.validDouble(1.0));
        Assertions.assertTrue(Ex1_1_5.validDouble(0.5));
    }

    @Test
    public void test1_1_6() {
        int f = 0;
        int g = 1;
        for (int i = 0; i < 15; i++) {
            System.out.print(" " + f);
            f = f + g;
            g = f - g;
        }
    }

    @Test
    public void test1_1_7_a() {
        double t = 9.0;
        while (Math.abs(t - 9.0 / t) > .001) {
            t = (9.0 / t + t) / 2;
            System.out.printf("%.5f\n", t);
        }
        System.out.printf("%.5f\n", t);
    }

    @Test
    public void test1_1_7_b() {
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            for (int j = 0; j < i; j++) {
                sum++;
            }
        }
        System.out.println(sum);
    }

    @Test
    public void test1_1_7_c() {
        int sum = 0;
        for (int i = 0; i < 1000; i = 2 * i) {
            for (int j = 0; j < 1000; j++) {
                sum++;
            }
        }
        System.out.println(sum);
    }

    @Test
    public void test1_1_8_a() {
        System.out.println('b');
    }

    @Test
    public void test1_1_8_b() {
        System.out.println('b' + 'c');
    }

    @Test
    public void test1_1_8_c() {
        System.out.println((char) ('b' + 4));
    }

    @Test
    public void test1_1_12() {
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = 9 - i;
        }
        for (int i = 0; i < 10; i++) {
            a[i] = a[a[i]];
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    @Test
    public void test1_1_14() {
        assertEquals(Ex1_1_14.lg(15), 3);
    }

    @Test
    public void test1_1_17() {
        System.out.println(exR1(6));
    }

    private static String exR1(int n) {
        if (n <= 0) return "";
        return exR1(n - 3) + n + exR1(n - 2) + n;
    }

}
