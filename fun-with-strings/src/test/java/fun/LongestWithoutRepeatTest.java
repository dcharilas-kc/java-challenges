package fun;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestWithoutRepeatTest {

    @Test
    public void test1() {
        LongestWithoutRepeat service = new LongestWithoutRepeat();
        assertEquals(3, service.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    public void test_allsame() {
        LongestWithoutRepeat service = new LongestWithoutRepeat();
        assertEquals(1, service.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    public void test2() {
        LongestWithoutRepeat service = new LongestWithoutRepeat();
        assertEquals(3, service.lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    public void test_empty() {
        LongestWithoutRepeat service = new LongestWithoutRepeat();
        assertEquals(0, service.lengthOfLongestSubstring(""));
    }
}
