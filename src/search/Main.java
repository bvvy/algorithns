package search;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, Date> dates = new HashMap<>();

        dates.put("mydate", new Date());
        dates.put("yourdate", new Date());
        System.out.println(dates);
    }
}
