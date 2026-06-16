class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        HashMap<Character,Integer> m = new HashMap<>();
        for(char c:s1.toCharArray()){
            m.put(c,m.getOrDefault(c,0)+1);
        }

        int low=0;
        HashMap<Character,Integer> m2 = new HashMap<>();
        int len=0;
        boolean flag=false;
        for(int i=0;i<s2.length();i++){
            char c=s2.charAt(i);
            m2.put(c,m2.getOrDefault(c,0)+1);

            len=i-low+1;
            if(len>s1.length()){
                m2.put(s2.charAt(low),m2.get(s2.charAt(low))-1);
            
                if(m2.get(s2.charAt(low))==0) m2.remove(s2.charAt(low));
                low++;
            }

            if(m.equals(m2)) flag=true;
        }
        return flag;
    }
}
