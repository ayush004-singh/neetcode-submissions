class Solution {
    public void check(int nums[], int i, int n, List<Integer> li, List<List<Integer>> ans) {
        // Base case
        if (i >= n) {
            ans.add(new ArrayList<>(li));
            return;
        }

        // Include
        li.add(nums[i]);

        check(nums, i + 1, n, li, ans);

        // Backtrack
        li.remove(li.size() - 1);

        // Exclude
        check(nums, i + 1, n, li, ans);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        check(nums, 0, nums.length, new ArrayList<>(), ans);

        return ans;
    }
}