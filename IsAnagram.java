/*
Given two strings s and t, write a function to determine if t is an anagram of s.

For example,
s = "anagram", t = "nagaram", return true.
s = "rat", t = "car", return false.

*/
public class Solution {
    public boolean isAnagram(String s, String t) {
        char[] array1 = s.replaceAll("[\\s]", "").toCharArray();
        char[] array2 = t.replaceAll("[\\s]", "").toCharArray();
        
        Arrays.sort(array1);
        Arrays.sort(array2);
        
        return Arrays.equals(array1, array2);
        
    }
}