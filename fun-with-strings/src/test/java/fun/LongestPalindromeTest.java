package fun;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestPalindromeTest {

    @Test
    public void test1() {
        LongestPalindrome service = new LongestPalindrome();
        assertEquals("bab", service.longestPalindrome("babad"));
    }

    @Test
    public void test2() {
        LongestPalindrome service = new LongestPalindrome();
        assertEquals("bb", service.longestPalindrome("cbbd"));
    }

    @Test
    public void huge() {
        LongestPalindrome service = new LongestPalindrome();
        assertEquals("ranynar", service.longestPalindrome("civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth"));
    }

    @Test
    public void empty() {
        LongestPalindrome service = new LongestPalindrome();
        assertEquals("", service.longestPalindrome(""));
    }
}
