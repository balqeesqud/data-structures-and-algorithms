package challenge.cc14;

import java.util.Stack;

public class MaxStack {

        private Stack<Integer> stack;
        private Stack<Integer> maxStack;

        public MaxStack() {
            stack = new Stack<>();
            maxStack = new Stack<>();
        }

        public void push(int val) {
            stack.push(val);

            if (maxStack.isEmpty() || val >= maxStack.peek()) {
                maxStack.push(val);
            }
        }

        public int pop() {
            if (stack.isEmpty()) {
                throw new IllegalStateException("Stack is empty");
            }

            int popped = stack.pop();
            if (popped == maxStack.peek()) {
                maxStack.pop();
            }
            return popped;
        }

        public int top() {
            if (stack.isEmpty()) {
                throw new IllegalStateException("Stack is empty");
            }
            return stack.peek();
        }

        public int getMax() {
            if (maxStack.isEmpty()) {
                throw new IllegalStateException("Stack is empty");
            }
            return maxStack.peek();
        }

}