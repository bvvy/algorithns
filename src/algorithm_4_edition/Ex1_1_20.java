package algorithm_4_edition;

/**
 * @author bvvy
 * @date 2018/5/21
 */
public class Ex1_1_20 {

    public static double lnNFactorial(int N) {
        return Math.log(factorial(N));
    }

    public static double lnNf(int N) {
        if (N == 1) return 0;
        return Math.log(N) + lnNf(N - 1);
    }

    private static double factorial(int n) {
        double tmp = 1;
        for (int i = 2; i <= n; i++) {
            tmp *= i;
        }
        return tmp;
    }


    public static void main(String[] args) {
        System.out.println(lnNf(2));
    }

}
