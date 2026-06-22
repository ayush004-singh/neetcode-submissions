class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("C")){
                st.pop();
            }
            else if(operations[i].equals("D")){
                st.push(2*st.peek());
            }
            else if(operations[i].equals("+")){
                int d2=st.pop();
                int d1=st.peek();
                int sum=d1+d2;
                st.push(d2);
                st.push(sum);
            }
            else{
                
                st.push(Integer.parseInt(operations[i]));
            }
        }
        int ans=0;
        while(!st.isEmpty()){
            ans+=st.pop();
        }
        return ans;
    }
}