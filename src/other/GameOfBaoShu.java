package other;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class GameOfBaoShu {
    public static void main(String[] args) {
        System.out.println(pick(7, 2, 1));
    }

    public static List<Integer> pick(int n, int s, int m) {
        List<Integer> arr = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            arr.add(i);
        }
        List<Integer> results = new ArrayList<>();
        int target = s - 1;
        while (!arr.isEmpty()) {
            target = (target + m) % arr.size();
            //当target=0时，target-1就是-1了，数组越界，其意思就是返回倒数第一个元素，即list.size()-1；
            if (target != 0) {
                Integer value = arr.remove(target - 1);
                results.add(value);
                target--;
            } else {
                Integer value = arr.remove(arr.size() - 1);
                results.add(value);
            }
        }
        return results;
    }
}
