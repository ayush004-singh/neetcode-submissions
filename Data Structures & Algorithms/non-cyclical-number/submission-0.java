class Solution {
    private int f(int n){
        int ans=0;
        while(n>0){
            int d=n%10;
            ans+=d*d;
            n/=10;
        }

        return ans;
    }
    public boolean isHappy(int n) {
        int fast=n;
        int slow=n;
        while(true){
            fast=f(f(fast));
            slow=f(slow);

            if(fast==1){
                return true;
            }
            
            if(slow==fast){
                return false;
            }
        }
    }
}