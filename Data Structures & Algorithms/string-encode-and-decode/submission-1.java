class Solution {

    public String encode(List<String> strs) {
 StringBuilder encoded = new StringBuilder();

        for (String str : strs) {
            encoded.append(str.length()); // store length
            encoded.append('#');          // separator
            encoded.append(str);          // actual string
        }

        return encoded.toString();
    }

    public List<String> decode(String str) {
        List<String> ans= new ArrayList<>();
        int i=0;
        int n=str.length();
       while(i<n){
             int len = 0;
            while(str.charAt(i)!='#'){
                len=len*10+(str.charAt(i)-'0');
                i++;
            }
            i++;
            ans.add(str.substring(i,len+i));
            i+=len;
        }   
        return ans;    
}
}
