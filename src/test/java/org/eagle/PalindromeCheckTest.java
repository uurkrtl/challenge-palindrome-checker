package org.eagle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeCheckTest {
    @Test
    void givenWord_whenPalindromeCheck_thenTrue(){
        PalindromeCheck palindromeCheck = new PalindromeCheck();
        Assertions.assertEquals(palindromeCheck.isPalindrome("racecar"),true);
        Assertions.assertEquals(palindromeCheck.isPalindrome("radar"),true);
        Assertions.assertEquals(palindromeCheck.isPalindrome("level"),true);
        Assertions.assertEquals(palindromeCheck.isPalindrome("kayak"),true);
        Assertions.assertEquals(palindromeCheck.isPalindrome("a"),true);
        Assertions.assertEquals(palindromeCheck.isPalindrome("live on time,emit no evil"),true);
    }

    @Test
    void givenWord_whenPalindromeNoCheck_thenFalse(){
        PalindromeCheck palindromeCheck = new PalindromeCheck();
        Assertions.assertEquals(palindromeCheck.isPalindrome("kartal"),false);
        Assertions.assertEquals(palindromeCheck.isPalindrome("ugur"),false);
    }
}
