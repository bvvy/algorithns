package algorithm_4_edition.ex1_3;

import sun.security.pkcs11.wrapper.CK_SSL3_KEY_MAT_OUT;

/**
 * @author bvvy
 * @date 2018/5/29
 */
public class Ex1_3_9 {
    private static String completeOpr(String oprStr) {
        String[] oprStrs = oprStr.split("");
        Stack<String> dataStack = new Stack<>();
        for (String oprChar : oprStrs) {
            if (oprChar.equals(")")) {
                String d1 = dataStack.pop();
                String opr1 = dataStack.pop();
                String d2 = dataStack.pop();
                dataStack.push("(" + d2 + opr1 + d1 + ")");
            } else {
                dataStack.push(oprChar);
            }
        }
        String result = "";
        for (String s : dataStack) {
            result = s + result;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(completeOpr("1+3)*3-4)*5-6)))"));

    }

}
