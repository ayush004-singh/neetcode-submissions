class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> m =new HashMap<>();
        for(String s:strs){
            char c[]=s.toCharArray();
            Arrays.sort(c);
            String k = new String(c);
            m.putIfAbsent(k,new ArrayList<>());
            m.get(k).add(s);
        }

        return new ArrayList<>(m.values());
    }
}
