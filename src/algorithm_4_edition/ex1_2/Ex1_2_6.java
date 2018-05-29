package algorithm_4_edition.ex1_2;

/**
 * @author bvvy
 * @date 2018/5/29
 */
public class Ex1_2_6 {

    public static boolean isCircle(String s, String t) {
        return (s + s).contains(t);
    }
}
