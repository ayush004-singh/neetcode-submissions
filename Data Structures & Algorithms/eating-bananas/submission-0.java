class Solution {

    public int max(int[] arr){

        int ans = 0;

        for(int i : arr){
            ans = Math.max(ans, i);
        }

        return ans;
    }

    public int minEatingSpeed(int[] piles, int h) {

        int low = 1;
        int high = max(piles);

        int ans = Integer.MAX_VALUE;

        while(low <= high){

            int mid = low + (high - low) / 2;

            int hours = 0;

            for(int pile : piles){

                hours += pile / mid;

                if(pile % mid != 0){
                    hours++;
                }
            }

            if(hours <= h){

                ans=Math.min(ans,mid);

                high = mid - 1;
            }
            else{

                low = mid + 1;
            }
        }

        return ans;
    }
}