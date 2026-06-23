class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> st = new Stack<>();

        for(int curr : asteroids) {

            boolean destroyed = false;

            // collision possible only when:
            // stack top is positive
            // current asteroid is negative
            while(!st.isEmpty() && st.peek() > 0 && curr < 0) {

                // top asteroid smaller
                if(st.peek() < Math.abs(curr)) {
                    st.pop();
                }

                // both same size
                else if(st.peek() == Math.abs(curr)) {
                    st.pop();
                    destroyed = true;
                    break;
                }

                // top asteroid bigger
                else {
                    destroyed = true;
                    break;
                }
            }

            // push only if current asteroid survived
            if(!destroyed) {
                st.push(curr);
            }
        }

        // convert stack to array
        int ans[] = new int[st.size()];

        for(int i = st.size() - 1; i >= 0; i--) {
            ans[i] = st.pop();
        }

        return ans;
    }
}