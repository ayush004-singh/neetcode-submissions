class Solution {
    public int lengthOfLongestSubstring(String s) {
        // HashMap<Character,Integer> m = new HashMap<>();
        HashSet<Character> m = new HashSet<>();
        int low=0;
        int ans=Integer.MIN_VALUE;
        for(int high=0;high<s.length();high++){
            char c=s.charAt(high);
            while(!m.isEmpty()&&m.contains(c)){
                m.remove(s.charAt(low));
                low++;
            }
            ans=Math.max(ans,high-low+1);
            m.add(c);
        }

        return ans==Integer.MIN_VALUE?0:ans;
    }
}
