class Solution {
    public int removeDuplicates(int[] nums) {
        int ofc=1;
        int curr=1;
        while(curr<nums.length){
            if(nums[curr]!=nums[curr-1]){
                nums[ofc]=nums[curr];
                ofc++;
                curr++;
            }
            else{
                curr++;
            }
        }
        return ofc;
    }
}