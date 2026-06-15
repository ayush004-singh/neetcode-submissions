class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0;
        int j=0;
        int idx = 0;
        int ans[] = new int[n+m];
        while(i<m&&j<n){
            if(nums1[i]<nums2[j]){
                ans[idx++]=nums1[i];
                i++;
            }
            else{
                ans[idx++]=nums2[j];
                j++;
            }
        }
        while(i<m){
            ans[idx++]=nums1[i];
            i++;
        }
        while(j<n){
            ans[idx++]=nums2[j];
            j++;
        }
        for(int k=0; k<n+m; k++){
    nums1[k] = ans[k];
}
    }
}