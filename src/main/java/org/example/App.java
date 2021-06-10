package org.example;

import javax.swing.text.html.Option;
import java.util.*;

public class App
{

    public static void main( String[] args )
    {
        String test = "ABCDC";

    }

    public static String findDuplication(String string) {
        Map<String, Integer> ctr = new LinkedHashMap<>();
        for(char c : string.toCharArray()) {
            String str = String.valueOf(c);
            Integer value = ctr.get(str);
            if (value != null) {
                ctr.put(str, ++value);
            } else {
                ctr.put(str, 1);
            }
        }

        Optional<String> res = ctr.entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .map(e -> e.getKey())
                .findFirst();

        return res.isPresent() ? res.get() : null;
    }
}
