class Solution {

    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        int[] arr1 = new int[nums.length - 1];
        int[] arr2 = new int[nums.length - 1];

        for (int i = 0; i < nums.length - 1; i++) {
            arr1[i] = nums[i + 1]; // exclude first house
            arr2[i] = nums[i];     // exclude last house
        }

        int s1 = robber(arr1);
        int s2 = robber(arr2);

        return Math.max(s1, s2);
    }

    private int robber(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        int[] grid = new int[nums.length];
        grid[0] = nums[0];
        grid[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length; i++) {
            grid[i] = Math.max(grid[i - 2] + nums[i], grid[i - 1]);
        }

        return grid[nums.length - 1];
    }
}
