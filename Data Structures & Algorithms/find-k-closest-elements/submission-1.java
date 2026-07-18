class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int low=0;
        List<Integer> ans = new ArrayList<>();
        int high = arr.length - k;
        while(low<high){
            int mid=low+(high-low)/2;
            if(x-arr[mid]>arr[mid+k]-x){
                low=mid+1;
            }
            else{
                high=mid;
            }
        }

        for(int i=low;i<low+k;i++){
            ans.add(arr[i]);
        }
        return ans;
    }
}