class Solution {
    public void dfs(int [] arr, int start, int n, int target,List<Integer> li, List<List<Integer>> ans){

        if(target==0) {
            ans.add(new ArrayList<>(li));
            return;
        }
        if(start==n||target<0){
            return;
        }

        for(int i=start;i<n;i++){
            if(i>start&&arr[i]==arr[i-1]) continue;
        
        li.add(arr[i]);
        dfs(arr,i+1,n,target-arr[i],li,ans);
        li.remove(li.size()-1);
        }
        }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(candidates);
        dfs(candidates,0,candidates.length,target,new ArrayList<>(),ans);
        return ans;
    }
}
