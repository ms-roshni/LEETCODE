class Solution {
    public int trap(int[] height) {
        int n = height.length;
        if (n == 0) return 0;

        int[] lb = new int[n];
        int[] rb = new int[n];

        lb[0] = height[0];
        for (int i = 1; i < n; i++) {
            lb[i] = Math.max(lb[i - 1], height[i]);
        }

        rb[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rb[i] = Math.max(rb[i + 1], height[i]);
        }

        int total = 0;
        for (int i = 0; i < n; i++) {
            total += Math.min(lb[i], rb[i]) - height[i];
        }

        return total;
    }
}
