package edu.psu.ist;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;

public class TestLongestCommonPrefix {

    @Test
    public void testTwoStrings() {
        LongestCommonPrefix app = new LongestCommonPrefix();
        ArrayList<String> strings = new ArrayList<>();
        strings.add("flower");
        strings.add("flow");

        String result = app.findLongestCommonPrefix(strings);
        assertEquals("flow", result);
    }

    @Test
    public void testThreeStrings() {
        LongestCommonPrefix app = new LongestCommonPrefix();
        ArrayList<String> strings = new ArrayList<>();
        strings.add("flower");
        strings.add("flow");
        strings.add("flight");

        String result = app.findLongestCommonPrefix(strings);
        assertEquals("fl", result); // Use assertEquals from JUnit 5
    }
}
