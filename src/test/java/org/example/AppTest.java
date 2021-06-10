package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest
{
    private static final String SCENARIO_1_TEST_STRING = "ABDAD";
    private static final String SCENARIO_1_EXPECTED_RESULT = "A";

    private static final String SCENARIO_2_TEST_STRING = "ABCD";
    private static final String SCENARIO_2_EXPECTED_RESULT = null;

    private static final String SCENARIO_3_TEST_STRING = "glovol";
    private static final String SCENARIO_3_EXPECTED_RESULT ="l";

    private static final String SCENARIO_4_TEST_STRING = "BCABA";
    private static final String SCENARIO_4_EXPECTED_RESULT ="B";

    @Test
    public void shouldFindDublication()
    {
        String result = App.findDuplication(SCENARIO_1_TEST_STRING);
        assertEquals( SCENARIO_1_EXPECTED_RESULT, result);
    }

    @Test
    public void shouldNotFindDuplications() {
        String result = App.findDuplication(SCENARIO_2_TEST_STRING);
        assertEquals( SCENARIO_2_EXPECTED_RESULT, result);
    }

    @Test
    public void shouldFindDuplicationsAtTheEnd() {
        String result = App.findDuplication(SCENARIO_3_TEST_STRING);
        assertEquals( SCENARIO_3_EXPECTED_RESULT, result);
    }

    @Test
    public void shouldFindDuplicationsAtTheEnd4() {
        String result = App.findDuplication(SCENARIO_4_TEST_STRING);
        assertEquals( SCENARIO_4_EXPECTED_RESULT, result);
    }
}
