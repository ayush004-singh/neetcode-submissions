class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> m = new HashMap<>();
        List<Integer> li = new ArrayList<>();
        for(int i:nums){
            m.put(i,m.getOrDefault(i,0)+1);
        }
        int n=nums.length;

        for(int i:nums){
            if(m.get(i)>n/3){
                li.add(i);
                m.put(i,0);
            } 
        }

        return li;
    }
}