class Solution {

    public String decodeString(String s) {

        Stack<Integer> num = new Stack<>();
        Stack<String> st = new Stack<>();

        String numStr = "";

        for(char c : s.toCharArray()) {

            // build number string
            if(Character.isDigit(c)) {

                numStr += c;
            }

            // opening bracket
            else if(c == '[') {

                num.push(Integer.parseInt(numStr));

                st.push("[");

                numStr = "";
            }

            // closing bracket
            else if(c == ']') {

                String temp = "";

                while(!st.peek().equals("[")) {

                    temp = st.pop() + temp;
                }

                st.pop();

                int count = num.pop();

                String repeated = "";

                for(int i = 0; i < count; i++) {

                    repeated += temp;
                }

                st.push(repeated);
            }

            // characters
            else {

                st.push(c + "");
            }
        }

        String ans = "";

        while(!st.isEmpty()) {

            ans = st.pop() + ans;
        }

        return ans;
    }
}