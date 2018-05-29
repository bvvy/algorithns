package algorithm_4_edition.ex1_2;

/**
 * @author bvvy
 * @date 2018/5/29
 */
public class Ex1_2_7 {

    private static String mystery(String s) {
        int N = s.length();
        if (N <= 1) {
            return s;
        }
        String a = s.substring(0, N / 2);
        String b = s.substring(N / 2, N);
        return mystery(a) + mystery(b);
    }

    public static void main(String[] args) {

        System.out.println(mystery("12345678"));
    }
}
