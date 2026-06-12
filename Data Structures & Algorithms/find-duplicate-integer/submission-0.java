class Solution {
    public int findDuplicate(int[] nums) {
        int fast=0;
        int slow=0;

        while(fast<nums.length){
            fast=nums[nums[fast]];
            slow=nums[slow];
            if(slow==fast){
                slow=0;
                while(slow!=fast){
                    slow=nums[slow];
                    fast=nums[fast];
                }

                return slow;
            }
        }
        return -1;
    }
}