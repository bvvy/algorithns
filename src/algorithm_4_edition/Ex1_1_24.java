package algorithm_4_edition;

/**
 * @author bvvy
 * @date 2018/5/21
 */
public class Ex1_1_24 {

    public static int euclid(int a, int b) {
        System.out.println(a + "---" + b);
        int p, q;
        if (a > b) {
            p = a;
            q = b;
        } else {
            p = b;
            q = a;
        }
        if (p % q == 0) {
            return q;
        } else {
            return euclid(q, p % q);
        }
    }


    public static void main(String[] args) {
        System.out.println(euclid(1111111,1234567));
        System.out.println(euclid(105,24));
    }
}
