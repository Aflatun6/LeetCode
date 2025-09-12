package org.leetcode.topInterview150.medium.minStack155;

import java.util.Arrays;

class MinStack {


    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(2);
        minStack.push(5);
        minStack.push(5);
        minStack.push(5);
        minStack.push(5);
        minStack.push(5);
        minStack.push(5);
        minStack.push(5);
        minStack.push(5);
        minStack.push(-3);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
        minStack.push(-100);
        System.out.println(minStack.top());
        minStack.push(0);
        System.out.println(minStack.getMin());
        minStack.push(Integer.MAX_VALUE);
        minStack.pop();
        minStack.pop();
        minStack.pop();
        minStack.pop();
        minStack.pop();
        minStack.pop();
        minStack.pop();
    }

    final double RESIZE_UP_RATE = 1.5;
    final double RESIZE_DOWN_RATE = 0.7;
    final int RESIZE_UP = 80;
    final int RESIZE_DOWN = 20;
    int MIN = Integer.MAX_VALUE;
    int CURRENT = 0;
    int NEXT = 0;
    int[] stack;


    public MinStack() {
        stack = new int[10];
    }

    public void push(int val) {
        stack[NEXT++] = val;
        CURRENT = NEXT - 1;
        if (val < MIN) {
            MIN = val;
        }
        stack = resizeUp(CURRENT, stack);
    }

    public void pop() {
        if (CURRENT < 0) {
            CURRENT = NEXT = 0;
            return;
        }
        int val = stack[CURRENT];
        stack[CURRENT--] = 0;
        NEXT--;
//        stack = resizeDown(CURRENT, stack);
        if (val == MIN) {
            MIN = findMin(stack, CURRENT);
        }
    }

    private int[] resizeDown(int CURRENT, int[] stack) {
        if ((CURRENT * 100 / stack.length) <= RESIZE_DOWN) {
            return Arrays.copyOf(stack, (int) (stack.length * RESIZE_DOWN_RATE));
        }
        return stack;
    }

    private int[] resizeUp(int CURRENT, int[] stack) {
        if (((CURRENT * 100 / stack.length)) >= RESIZE_UP) {
            return Arrays.copyOf(stack, (int) (stack.length * RESIZE_UP_RATE));
        }
        return stack;
    }

    private int findMin(int[] stack, int CURRENT) {
        return Arrays.stream(stack).limit(CURRENT + 1).min().orElse(Integer.MAX_VALUE);
    }

    public int top() {
        return stack[CURRENT];
    }

    public int getMin() {
        return MIN;
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