class Solution {
    public void dfs(int n,int open,int close,String s,List<String> ans){
        if(open==close&&open+close==n*2){
            ans.add(s);
            return;
        }
        if(open<n){
            dfs(n,open+1,close,s+"(",ans);
        }
        if(close<open){
            dfs(n,open,close+1,s+')',ans);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        dfs(n,0,0,"",ans);
        return ans;
    }
}
