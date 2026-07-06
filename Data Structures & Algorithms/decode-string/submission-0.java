class Solution {

    public String decodeString(String s) {

        Stack<Integer> num = new Stack<>();
        Stack<String> st = new Stack<>();

        int k = 0;

        for(char c : s.toCharArray()) {

            // number
            if(Character.isDigit(c)) {

                k = k * 10 + (c - '0');
            }

            // opening bracket
            else if(c == '[') {

                num.push(k);

                st.push("[");

                k = 0;
            }

            // closing bracket
            else if(c == ']') {

                String temp = "";

                // build inside string
                while(!st.peek().equals("[")) {

                    temp = st.pop() + temp;
                }

                st.pop(); // remove [

                int count = num.pop();

                String repeated = "";

                for(int i = 0; i < count; i++) {

                    repeated += temp;
                }

                st.push(repeated);
            }

            // normal character
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