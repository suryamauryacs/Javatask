//package leetcode.Stack;
//
////https://leetcode.com/problems/min-stack/description/
//
//
////Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
////
////Implement the MinStack class:
////
////MinStack() initializes the stack object.
////void push(int value) pushes the element value onto the stack.
////void pop() removes the element on the top of the stack.
////int top() gets the top element of the stack.
////int getMin() retrieves the minimum element in the stack.
////You must implement a solution with O(1) time complexity for each function.
////
////
////
////Example 1:
////
////Input
////["MinStack","push","push","push","getMin","pop","top","getMin"]
////[[],[-2],[0],[-3],[],[],[],[]]
////
////Output
////[null,null,null,null,-3,null,0,-2]
////
////Explanation
////MinStack minStack = new MinStack();
////minStack.push(-2);
////minStack.push(0);
////minStack.push(-3);
////minStack.getMin(); // return -3
////minStack.pop();
////minStack.top();    // return 0
////minStack.getMin(); // return -2
//
//import java.util.Scanner;
//import java.util.Stack;
//
//public class MinStack155 {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        String str = sc.nextLine();
//
//        String[] arr = str.split(" ");
//
//        MinStack ms = new MinStack();
//
//        for(String s : arr){
//            ms.push(Integer.parseInt(s));
//        }
//
//        System.out.println(ms.getMin());
//
//    }
//
//
//
//        private Stack<Integer> st;
//        private Stack<Integer> min;
//        public static MinStack() {
//            st = new Stack<>();
//            min = new Stack<>();
//        }
//
//        public void push(int value) {
//            st.push(value);
//            if (min.isEmpty() || value <= min.peek()) {
//                min.push(value);
//            }
//        }
//
//        public void pop() {
//            int ele1 = st.pop();
//            int ele2 = min.peek();
//            if(ele1 == ele2){
//                min.pop();
//            }
//        }
//
//        public int top() {
//            return st.peek();
//        }
//
//        public int getMin() {
//            return min.peek();
//        }
//
//
//
//}
