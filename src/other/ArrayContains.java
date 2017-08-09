package other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by bvvy on 2017/8/9.
 */
public class ArrayContains {


    public static void main(String[] args) {
        Comparable[] a = {"2", "A", "b", "c", "c", "d"};
        Comparable[] b = {"A", "b","c"};
        System.out.println(contains(a, b));

        List<Integer> al = Arrays.asList(1, 3, 3, 5, 6, 7, 8, 1);
        List<Integer> bl = Arrays.asList(8, 3, 6);
        System.out.println(al.containsAll(bl));;
    }

    public static  int contains(Comparable a[], Comparable[] b) {
        int i = 0, j = 0;
        while(i<a.length){
            if (a[i].equals(b[j++])) {
                if(j==b.length) return i;
            } else j = 0;
            i++;
        }
        return 0;
    }

    private static boolean eq(Comparable a, Comparable b) {
        return a.compareTo(b) == 0;
    }
}
