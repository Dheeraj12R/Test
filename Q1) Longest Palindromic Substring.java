// String + Two pointer solution: expand from 2n - 1 centers
// Time: O(n ^ 2), 6ms
// Space: O(1), 36.2mb
class Solution {
    public String longestPalindrome(String s) {
        // Max len of substring and its start pos
        int max = 0, start = 0;
        
        // Expand from every possible centers
        for(int i = 0; i < s.length(); i++) {
            int len1 = expand(s, i, i);
            int len2 = expand(s, i, i + 1);
            int len = Math.max(len1, len2);
            
            if(len > max) {
                max = len;
                start = i - (len - 1) / 2;
            }
        }
        
        return s.substring(start, start + max);
    }
    
    private int expand(String s, int l, int r) {
        while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        
        // Palindrome is in (l, r)
        return r - l - 1;
    }
}