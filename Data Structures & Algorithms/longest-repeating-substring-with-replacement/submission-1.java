class Solution {
       public static int Max(int arr[]){
        int ans = 0;
        for(int i : arr){
            ans = Math.max(ans, i);
        }
        return ans;
    }
    
    public int characterReplacement(String s, int k) {
        int ans=0;
        int arr[] = new int[26];
        int len=0;
        int low=0;
        int max=0;
        for(int high=0;high<s.length();high++){
            arr[s.charAt(high)-'A']++;
            max=Max(arr);
            len=high-low+1;
            while(len-max>k){
                arr[s.charAt(low)-'A']--;
                low++;
                len=high-low+1;
                max=Max(arr);
            }
            ans=Math.max(ans,len);
        }
        return ans;
    }
}
