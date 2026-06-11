class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashSet<Integer> set = new HashSet<>();

        int low = 0;

        for (int high = 0; high < nums.length; high++) {

            if (set.contains(nums[high])) {
                return true;
            }

            set.add(nums[high]);

            // Maintain window size k
            if (high - low >= k) {
                set.remove(nums[low]);
                low++;
            }
        }

        return false;
    }
}