class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length())
            return false;

        int[] need = new int[26];
        int[] window = new int[26];

        // frequency of s1
        for (char c : s1.toCharArray()) {
            need[c - 'a']++;
        }

        int left = 0, right = 0;

        while (right < s2.length()) {
            char c = s2.charAt(right);
            window[c - 'a']++;
            right++;

            // if window is too big, shrink from left
            while (window[c - 'a'] > need[c - 'a']) {
                window[s2.charAt(left) - 'a']--;
                left++;
            }

            // if window size matches s1 length → found permutation
            if (right - left == s1.length())
                return true;
        }

        return false;
    }
}