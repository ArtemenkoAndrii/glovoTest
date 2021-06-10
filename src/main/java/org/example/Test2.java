package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test2 {

    public static List<Integer> superSort(List<Integer> list) {
        List<Integer> result = new ArrayList<>(list.size());

        do {
            Integer min = getMin(list);
            Integer max = getMax(list);
            result.add(min);
            result.add(max);
        } while (!list.isEmpty());

        return result;
    }

    private static int getMin(List<Integer> list) {
        list.sort(Comparator.comparingInt(i -> i.intValue()));
        Integer result = list.get(0);
        list.remove(0);
        return result;
    }

    private static int getMax(List<Integer> list) {
        list.sort(Comparator.comparingInt(i -> i.intValue()));
        Integer result = list.get(list.size()-1);
        list.remove(list.size()-1);
        return result;
    }


}
