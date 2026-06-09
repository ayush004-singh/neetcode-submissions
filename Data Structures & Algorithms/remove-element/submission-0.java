class Solution {
    public int removeElement(int[] nums, int val) {
        int curr=0;
        int check=0;
        while(curr<nums.length){
            if(nums[curr]!=val){
                nums[check]=nums[curr];
                curr++;
                check++;
            }
            else{
                curr++;
            }
        }
        return check;
    }
}