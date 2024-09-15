package edu.psu.ist;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;

public class tester {

    @Test
    public void testFindLongestCommonPrefixEmptyList() {
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        ArrayList<String> emptyList = new ArrayList<>();

        assertEquals("", lcp.findLongestCommonPrefix(emptyList));
    }
}
