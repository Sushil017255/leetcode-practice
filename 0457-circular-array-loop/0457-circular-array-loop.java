
class Solution {
    public boolean circularArrayLoop(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {

            HashSet<Integer> set = new HashSet<>();

            boolean forward = nums[i] > 0;
            int curr = i;

            while (true) {

                // Direction should remain same
                if ((nums[curr] > 0) != forward) {
                    break;
                }

                // Already visited in this path
                if (set.contains(curr)) {
                    return true;
                }

                set.add(curr);

                int next = ((curr + nums[curr]) % n + n) % n;

                // One element loop is invalid
                if (next == curr) {
                    break;
                }

                curr = next;
            }
        }

        return false;
    }
}