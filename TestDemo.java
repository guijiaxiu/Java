package 设计一个最小栈;

public class TestDemo {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-10);
        minStack.push(1);
        minStack.push(-30);
        System.out.println(minStack.getMin()); //-30
        minStack.pop();
        System.out.println(minStack.getMin()); //-10
    }
}
