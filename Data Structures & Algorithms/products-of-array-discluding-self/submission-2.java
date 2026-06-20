class Solution {
    public int[] productExceptSelf(int[] nums) {
        int arrf[] = new int[nums.length];
        arrf[0] = nums[0];
        int arrb[] = new int[nums.length];
        arrb[arrb.length - 1] = nums[nums.length - 1];
        for (int i = 1; i < nums.length; i++) {
            arrf[i] = arrf[i - 1] * nums[i];
        }
        for (int i = nums.length - 2; i >= 0; i--) {
            arrb[i] = arrb[i + 1] * nums[i];
        }
        nums[0] = arrb[1];
        nums[nums.length - 1] = arrf[arrf.length - 2];
        for (int i = 1; i < nums.length - 1; i++) {
            nums[i] = arrf[i - 1] * arrb[i + 1];
        }
        return nums;
    }
}
