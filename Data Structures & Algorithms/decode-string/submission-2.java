class Solution {
    public String decodeString(String s) {
        Stack<String> st = new Stack<>();
        Stack<Integer> num = new Stack<>();
          String numstr="";
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                numstr+=s.charAt(i);
            }

            else if(s.charAt(i)=='['){
                num.push(Integer.parseInt(numstr));
                st.push("[");
                numstr="";
            }
            else if(s.charAt(i)==']'){
                String temp="";
                while(!st.peek().equals("[")){
                    temp=st.pop()+temp;
                }
                st.pop();
                int count=num.pop();
                String repeated="";
                for(int j=0;j<count;j++){
                    repeated+=temp;
                }

                st.push(repeated);
            }
              else{
                st.push(s.charAt(i)+"");
            }
        }

        String ans="";
        while(!st.isEmpty()){
            ans=st.pop()+ans;
        }
        return ans;
    }
}