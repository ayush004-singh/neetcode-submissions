class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right=heights.length-1;
        int ans=0;
        while(left<right){
            int h=Math.min(heights[left],heights[right]);
            int b=right-left;
            int area=h*b;
            ans=Math.max(ans,area);
            if(heights[left]<heights[right]){
                left++;
            }
            else right--;
        }
        return ans;
    }
}
