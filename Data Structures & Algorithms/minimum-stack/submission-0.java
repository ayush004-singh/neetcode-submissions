class MinStack {

    Stack<Integer> st = new Stack<>();
    Stack<Integer> mst = new Stack<>();

    public MinStack() {

    }

    public void push(int val) {

        st.push(val);

        if(mst.isEmpty() || val <= mst.peek()) {
            mst.push(val);
        }
    }

    public void pop() {

        if(st.peek().equals(mst.peek())) {
            mst.pop();
        }

        st.pop();
    }

    public int top() {

        return st.peek();
    }

    public int getMin() {

        return mst.peek();
    }
}