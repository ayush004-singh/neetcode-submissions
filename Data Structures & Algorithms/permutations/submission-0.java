class Solution {

    public void dfs(int[] nums, boolean[] used, List<Integer> curr, List<List<Integer>> ans) {

        // Base Case
        if (curr.size() == nums.length) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        // Try every number
        for (int i = 0; i < nums.length; i++) {

            // Already used? Skip it.
            if (used[i]) continue;

            // Choose
            used[i] = true;
            curr.add(nums[i]);

            dfs(nums, used, curr, ans);

            // Backtrack
            curr.remove(curr.size() - 1);
            used[i] = false;
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] used = new boolean[nums.length];

        dfs(nums, used, new ArrayList<>(), ans);

        return ans;
    }
}