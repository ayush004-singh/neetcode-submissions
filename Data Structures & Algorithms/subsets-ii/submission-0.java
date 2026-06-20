class Solution {
    public void check(int nums[],List<List<Integer>> ans, List<Integer> li , int start){
        ans.add(new ArrayList<>(li));
        for(int i=start;i<nums.length;i++){
            if(i>start&&nums[i]==nums[i-1]) continue;
            li.add(nums[i]);
            check(nums,ans,li,i+1);
            li.remove(li.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        check(nums,ans,new ArrayList<>(),0);
        return ans;
    }
}
