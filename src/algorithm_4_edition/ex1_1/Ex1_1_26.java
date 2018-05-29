package algorithm_4_edition.ex1_1;

/**
 * @author bvvy
 * @date 2018/5/21
 */
public class Ex1_1_26 {
    private static int times = 0;

    public static double binomial(int N, int k, double p) {
        System.out.println(++times);
        if (N == 0 && k == 0) {
            return 1.0;
        }
        if (N < 0 || k < 0) {
            return 0.0;
        } else {
            return (1.0 - p) * binomial(N - 1, k, p) + p * binomial(N - 1, k - 1, p);
        }
    }
    public static void main(String[] args) {

        binomial(5, 3, .25);
    }
}
