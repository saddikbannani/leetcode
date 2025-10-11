	class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        char[] T = new char[n];
        for (int i = n - 1; i >= 0; i--) {
            T[n - 1 - i] = s[i];
        }
        for (int i = 0; i < n; i++) {
            s[i] = T[i];
        }
    }
}
// Time: O(n)
// Space: O(n)
 