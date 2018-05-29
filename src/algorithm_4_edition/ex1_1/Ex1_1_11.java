package algorithm_4_edition.ex1_1;

/**
 * @author bvvy
 * @date 2018/5/20
 */
public class Ex1_1_11 {

    public static void  printFormatBool(boolean[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]) {
                    System.out.println(i + "-" + j + "*");
                } else {
                    System.out.println(i + "-" + j + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        boolean[][] arr = {{true, true}, {true, false}};
        printFormatBool(arr);
    }
}
