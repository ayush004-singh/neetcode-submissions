class Solution {

    public static void check(int arr[],
                             int i,
                             int n,
                             List<List<Integer>> ans,
                             List<Integer> li,
                             int target){

        // success
        if(target == 0){

            ans.add(new ArrayList<>(li));
            return;
        }

        // out of bounds or exceeded
        if(i >= n || target < 0){
            return;
        }

        // include
        li.add(arr[i]);

        check(arr, i, n, ans, li, target - arr[i]);

        li.remove(li.size()-1);

        // exclude
        check(arr, i+1, n, ans, li, target);
    }

    public List<List<Integer>> combinationSum(int[] nums, int target) {

        List<List<Integer>> ans = new ArrayList<>();

        check(nums, 0, nums.length, ans,
              new ArrayList<>(), target);

        return ans;
    }
}