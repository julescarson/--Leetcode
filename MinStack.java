import java.util.Stack;

class MinStack {
    Stack<Integer> r = new Stack<>();
    Stack<Integer> min = new Stack<>();

    public MinStack() {
    }

    public void push(int val) {
        this.r.push(val);
        if (this.min.isEmpty() || this.r.peek() <= this.min.peek()) {
            this.min.push(val);
        }
    }

    public void pop() {
        if (this.min.peek().equals(this.r.peek())) {
            this.min.pop();
        }
        this.r.pop();
    }

    public int top() {
        return this.r.peek();
    }

    public int getMin() {
        return this.min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */