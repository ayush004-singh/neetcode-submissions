class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        String op = "+-/*";
        for(String s:tokens){
            if(op.contains(s)){
                int d2=st.pop();
                int d1=st.pop();
                int res=0;
                if(s.equals("+")){
                    res=d1+d2;
                }
                else if(s.equals("-")){
                    res=d1-d2;
                }
                 else if(s.equals("/")){
                    res=d1/d2;
                }
                 else if(s.equals("*")){
                    res=d1*d2;
                }
                st.push(res);

            }

            else{
                st.push(Integer.parseInt(s));
            }
        }
        return st.pop();
    }
}
