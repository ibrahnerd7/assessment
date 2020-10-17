package com.company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MissingTest {
    @Test
    public void MissingInitializesCorrectly() {
        Missing missingInstance = new Missing();
        assertTrue(missingInstance instanceof Missing);
    }

    @Test
    public void getMissingNumberReturnsZeroWhenNoNumbers() {
        int[] emptyTestNums = {};
        int expected = 0;

        Missing missingInstance = new Missing();
        assertEquals(expected, missingInstance.getMissingNumber(emptyTestNums));
    }

    @Test
    public void getMissingReturnsValueWhenNumbersPositive() {
        int[] testNums = {1, 2, 4, 6, 3, 7, 8};
        int expected = 5;
        Missing missingInstance = new Missing();
        assertEquals(expected, missingInstance.getMissingNumber(testNums));
    }

    @Test
    public void getMissingReturnsValueWhenNumbersNegatives() {
        int[] testNums = {-1, -2, -4, -6, -3, -7, -8};
        int expected = -5;
        Missing missingInstance = new Missing();
        assertEquals(expected, missingInstance.getMissingNumber(testNums));
    }
}