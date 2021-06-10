package org.example;


import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Test2Test {

    private static final List<Integer> SCENARIO_1 = Arrays.asList(new Integer[]{1, 5, 9, 2, 4, 6});
    private static final List<Integer> EXPECTED_1 = List.of(1, 9, 2, 6, 4, 5);

    @Test
    public void shouldSort() {
        List<Integer> result = Test2.superSort(SCENARIO_1);

        for(int i=0; i<EXPECTED_1.size()-1; i++) {
            assertEquals(EXPECTED_1.get(i), result.get(i));
        }
    }

}
