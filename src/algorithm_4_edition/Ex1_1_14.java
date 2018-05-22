package algorithm_4_edition;

/**
 * @author bvvy
 * @date 2018/5/21
 */
public class Ex1_1_14 {

    public static int lg(int N) {
        int i = 1, n = 2;
        while (n <= N) {
            n *= n;
            i++;
        }
        return i;
    }
}
