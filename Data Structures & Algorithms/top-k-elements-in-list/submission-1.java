class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> m = new HashMap<>();
        for(int i:nums){
            m.put(i,m.getOrDefault(i,0)+1);
        }
        int ans[]=new int[k];
        for(int i=0;i<k;i++){
            int maxfreq=0;
            int element=0;
            for(int key:m.keySet()){
                if(m.get(key)>maxfreq){
                    maxfreq=m.get(key);
                    element=key;
                }
            }
            ans[i]=element;
            m.remove(element);
        }

        return ans;
    }

}
