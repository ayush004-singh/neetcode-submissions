class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        Map<Character,Integer> m = new HashMap<>();
        for(char c:s.toCharArray()){
            m.put(c,m.getOrDefault(c,0)+1);
        }
        for(char d:t.toCharArray()){
            if(m.containsKey(d)){
                m.put(d,m.get(d)-1);
                if(m.get(d)==0) m.remove(d);
            }
        }

        return m.isEmpty();
    }
}
