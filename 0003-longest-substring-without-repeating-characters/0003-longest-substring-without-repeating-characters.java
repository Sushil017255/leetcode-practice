class Solution {
    public int lengthOfLongestSubstring(String s) {
        // abc 
        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int max = 0;

        for (int right = 0; right < s.length(); right++) {

            // Remove characters until duplicate is gone
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            // Add current character
            set.add(s.charAt(right));

            // Calculate window length
            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}