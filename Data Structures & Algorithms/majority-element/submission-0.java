class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> m = new HashMap<>();
        for(int i:nums){
            m.put(i,m.getOrDefault(i,0)+1);
        }

        int n=nums.length;

        for(int i:nums){
            if(m.get(i)>n/2) return i;
        }
        return -1;
    }
}