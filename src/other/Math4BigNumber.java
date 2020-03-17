package other;

import java.util.HashMap;

/**
 * Created by bvvy on 2017/8/9.
 */
public class Math4BigNumber {
    public static String bigNumPlus(String a, String b) {
        int alen = a.length();
        int blen = b.length();
        int maxLen = alen > blen ? alen : blen;
        int nTakeOver = 0 ; //溢出数量
        StringBuilder result = new StringBuilder();
        System.out.println();
        if (alen > blen) b = fill0(b, alen);
        else a = fill0(a, blen);
        for (int i =maxLen-1; i >= 0; i--) {
            int iSum = Integer.parseInt(a.charAt(i) + "") + Integer.parseInt(b.charAt(i) + "") + nTakeOver;
            if (iSum >= 10) {
                result.insert(0, iSum% 10 );
                nTakeOver = 1;
            } else {
                result.insert(0, iSum% 10 );
                nTakeOver = 0;
            }
        }
        if (nTakeOver == 1) {
            result.insert(0, "1");
        }
        return result.toString();
    }

    private static String fill0(String s, int tarLen) {
        StringBuilder zeroStr = new StringBuilder();
        for (int i = s.length(); i < tarLen; i++) {
            zeroStr.append("0");
        }
        return zeroStr + s;
    }

    public static void main(String[] args) {
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();

        System.out.println(bigNumPlus("9999999999", "1"));
    }

}
