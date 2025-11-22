class Solution {
    public int characterReplacement(String s, int k) {
         int[] freq = new int[26];
        int left = 0, maxFreq = 0, result = 0;

        for (int right = 0; right < s.length(); right++) {
            // update frequency of current character
            int idx = s.charAt(right) - 'A';
            freq[idx]++;
            maxFreq = Math.max(maxFreq, freq[idx]);

            // if replacements needed > k, shrink the window
            while ((right - left + 1) - maxFreq > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            // update result
            result = Math.max(result, right - left + 1);
        }

        return result;
    }
}