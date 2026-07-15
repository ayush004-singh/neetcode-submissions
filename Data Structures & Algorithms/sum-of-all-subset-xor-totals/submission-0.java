class Solution {
    public int subsetXORSum(int[] nums) {
        return dfs(nums, 0, 0);
    }

    public int dfs(int[] nums, int index, int currXor) {

        // Base Case
        if (index == nums.length) {
            return currXor;
        }

        // Include current element
        int take = dfs(nums, index + 1, currXor ^ nums[index]);

        // Exclude current element
        int notTake = dfs(nums, index + 1, currXor);

        // Total XOR sum of both choices
        return take + notTake;
    }
}