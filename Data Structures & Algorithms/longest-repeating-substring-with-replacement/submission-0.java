class Solution {
    
    // Helper function: returns the count of the most frequent character in arr
    public static int max(int arr[]){
        int ans = 0;
        for(int i : arr){
            ans = Math.max(ans, i);
        }
        return ans;
    }
    
    public int characterReplacement(String s, int k) {
        int arr[] = new int[26];
        int low = 0;
        int currmax = 0;
        int ans = 0;
        for(int high=0;high<s.length();high++){
            arr[s.charAt(high)-'A']++;
            currmax=max(arr);
            int len=high-low+1;
            while(len-currmax>k){
                arr[s.charAt(low)-'A']--;
                low++;
                currmax=max(arr);
                len=high-low+1;
            }
            ans=Math.max(ans,len);
        }
        
        return ans;
    }
}