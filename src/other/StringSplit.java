package other;

import java.util.ArrayList;
import java.util.List;

public class StringSplit {
    public static void main(String[] args) {
        String s = "abc|abc|b|ac";
        System.out.println(split(s, '|'));

    }

    public static List<String> split(String str, char splitter) {
        List<String> strings = new ArrayList<>();
        char[] chars = str.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            char character = chars[i];
            if (splitter == character) {
                strings.add(stringBuilder.toString());
                stringBuilder = new StringBuilder();
            } else {
                stringBuilder.append(character);
            }
            if (i == chars.length - 1) {
                strings.add(stringBuilder.toString());
            }
        }
        return strings;
    }
}
