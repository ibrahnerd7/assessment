package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseTest {

    @Test
    public void ReverseInGroupsOfFourInitializesCorrectly() {
        Reverse reverseInstance = new Reverse();
        assertTrue(reverseInstance instanceof Reverse);
    }

    @Test
    public void reverseInGroupsOfFour() {
        String testString = "Lorem at";
        String expected = "eroLta m";

        Reverse reverseInstance = new Reverse();
        assertEquals(expected,reverseInstance.reverseInGroupsOfFour(testString));
    }

}