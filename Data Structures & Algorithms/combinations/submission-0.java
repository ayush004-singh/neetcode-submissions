class Solution {
   public void check(int s,int n, int k, List<Integer> li, List<List<Integer>> ans) {
        // Base case
        if (li.size()==k) {
            ans.add(new ArrayList<>(li));
            return;
        }
        for(int i=s;i<=n;i++){

        // Include
        li.add(i);

        check(i+ 1,n, k, li, ans);

        // Backtrack
        li.remove(li.size() - 1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        check(1,n,k,new ArrayList<>(),ans);
        return ans;
    }
}