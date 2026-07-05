class Solution {
    private static void com(String digits, int idx,String p,List<String> ans,HashMap<Character, String> m){
        if(idx==digits.length()){
            ans.add(p);
            return;
        }
        String l = m.get(digits.charAt(idx));
        for(char c:l.toCharArray()){
            com(digits,idx+1,p+c,ans,m);
        }

    }
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if(digits.length()==0) return ans;

        HashMap<Character,String> m = new HashMap<>();
        m.put('2',"abc");
        m.put('3',"def");
        m.put('4',"ghi");
         m.put('5', "jkl");
        m.put('6', "mno");
        m.put('7', "pqrs");
        m.put('8', "tuv");
        m.put('9', "wxyz");

        com(digits,0,"",ans,m);

        return ans;
    }
}