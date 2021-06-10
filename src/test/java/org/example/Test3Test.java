package org.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class Test3Test {
    private static final List<Integer> SCENARTIO_1 = List.of(4, 2, -3, 1, 6);
    private static final boolean EXPECTED_1 = true;

    private static final List<Integer> SCENARTIO_2 = List.of(-3, 2, 3, 1, 6);
    private static final boolean EXPECTED_2 = false;

    private static final List<Integer> SCENARTIO_3 = List.of(4, 2, 0, 1, 6);
    private static final boolean EXPECTED_3 = true;


    @Test
    public void shouldFound1() {
        List<Integer> result = Test3.test(SCENARTIO_1);
        assertEquals(EXPECTED_1, result.size()>0);
    }

    @Test
    public void shouldNotFound2() {
        List<Integer> result = Test3.test(SCENARTIO_2);
        assertEquals(EXPECTED_2, result.size()>0);
    }

    @Test
    public void shouldFound2() {
        List<Integer> result = Test3.test(SCENARTIO_3);
        assertEquals(EXPECTED_3, result.size()>0);
    }
}
