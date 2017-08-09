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
        Comparable[] b = {"A", "b","c","c"};
        System.out.println(containsChild(a, b));
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

    public static int containsChild(Comparable [] a , Comparable [] b) {
        for(int i=0,j=0;i<a.length;i++) {
            if(eq(a[i],b[j++])){
                if(j==b.length) return i;
            } else j = 0;
        }
        return -1;
    }

    private static boolean eq(Comparable a, Comparable b) {
        return a.compareTo(b) == 0;
    }
}
