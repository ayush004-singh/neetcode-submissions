class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int max=nums[0];
        for(int i:nums){
            sum=Math.max(sum+i,i);
            max=Math.max(max,sum);
        }
        return max;
    }
}
