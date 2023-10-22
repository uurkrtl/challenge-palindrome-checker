package org.eagle;

public class PalindromeCheck {

    boolean isPalindrome(String word){
        String palindrome="";
        //palindrome=new StringBuilder(word).reverse().toString();
        char[] letters = word.toCharArray();
        for (int i=letters.length-1; 0<=i; i--){
            palindrome+=letters[i];
        }
        return word.equals(palindrome);
    }
}