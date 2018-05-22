package algorithm_4_edition;

import java.util.Scanner;

/**
 * @author bvvy
 * @date 2018/5/20
 */
public class Ex1_1_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a == b && b == c) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }
}
