import java.util.LinkedHashSet;
import java.util.Set;

/*https://leetcode.com/problems/is-subsequence/
Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
Example 1:
Input: s = "abc", t = "ahbgdc"
Output: true
Example 2:
Input: s = "axc", t = "ahbgdc"
Output: false*/
public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        if(s == null ||t == null){
            return false;
        }
        Set<Character> set = new LinkedHashSet<>();
        Set<Character> sub = new LinkedHashSet<>();
        for(int i = 0; i < t.length(); i++){
            set.add(t.charAt(i));
        }
        for(int i = 0; i < s.length(); i++){
            sub.add(s.charAt(i));
        }
        System.out.println(set);
        System.out.println(sub);
        return set.equals(sub);
    }

    public static void main(String[] args) {
        System.out.println(isSubsequence("acb", "abc"));
    }
}
