class Solution {
    public static void rev(int arr[],int i,int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n=nums.length-1;
        k%=n+1;
        rev(nums,0,n);
        rev(nums,0,k-1);
        rev(nums,k,n);
    }
}